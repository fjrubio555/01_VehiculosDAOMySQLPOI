package tz.franrubio.vehiculos.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tz.franrubio.vehiculos.model.Modelo;

/**
 * Clase ModeloDAOMySQLImpl
 *
 * Esta clase hereda de la clase BBDDManager e implementa los métodos
 * adicionales del ModeloDAO.
 *
 * @author Francisco J. Rubio
 * @version 1.0
 * @since 27/06/2018
 */
public class ModeloDAOMySQLImpl extends BBDDManager implements ModeloDAO {

    //Constantes con los diferentes mensajes de error.
    public static final String EXC_MENSG1 = "No se ha establecido conexión con la base de datos.";
    public static final String EXC_MENSG2 = "El modelo ya existe en la base de datos.";
    public static final String EXC_MENSG3 = "Error en la base de datos.";
    public static final String EXC_MENSG4 = "El Modelo ya no existe en la base de datos.";
    public static final String EXC_MENSG5 = "La Marca ya no existe en la base de datos.";
    public static final String EXC_MENSG6 = "El valor introducido no es numérico";
    public static final String EXC_MENSG7 = "¿Desea guardar los cambios?";
    public static final String EXC_MENSG8 = "Guardaro";
    public static final String EXC_MENSG9 = "¿Desea añadir un nuevo registro?";
    public static final String EXC_MENSG10 = "Añadir";
    public static final String EXC_MENSG11 = "¿Desea eliminar el registro actual?";
    public static final String EXC_MENSG12 = "Eliminar";
    public static final String EXC_MENSG13 = "No puede haber cambos vacios.";

    /**
     * Sobreescritua del método addModelo
     *
     * Añade un modelo nuevo a la base de datos sino existe.
     *
     * @param modelo Modelo de Vehiculo.
     * @throws Exception Error general.
     */
    @Override
    public void addModelo(Modelo modelo) throws Exception {
        try {
            String sql = null;

            //Abrimos la base de datos
            this.openConexion();
            //Comprobamos que el modelo no existe en la base de datos antes de añadirlo.
            sql = "SELECT * FROM MODELOS WHERE ID_MARCA=? && UPPER(RTRIM(MODELO))=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, modelo.getIdMarca());
            ps.setString(2, modelo.getNombreModelo().toUpperCase().trim());
            ResultSet rs = ps.executeQuery();
            if (!rs.first()) {
                sql = "INSERT INTO MODELOS (ID_MARCA, MODELO, CONSUMO, EMISIONES, C_ENERGETICA) VALUE (?, ?, ?, ?, ?)";
                ps = con.prepareStatement(sql);
                ps.setInt(1, modelo.getIdMarca());
                ps.setString(2, modelo.getNombreModelo().trim());
                ps.setFloat(3, modelo.getConsumoModelo());
                ps.setFloat(4, modelo.getEmisionesModelo());
                ps.setString(5, modelo.getClaEner().trim());
                ps.execute();

            } else {
                throw new Exception(EXC_MENSG2);
            }
        } catch (ClassNotFoundException ex) {
            throw new Exception(EXC_MENSG1);
        } catch (SQLException ex) {
            ErroresBasedatos(ex);
        } finally {
            this.closeConexion();
        }

    }

    /**
     * Sobreescritura del método deleteModelo
     *
     * Elimina un registro de la tabla modelo de la base de datos.
     *
     * @param id: Identificador el registro a borrar.
     * @throws Exception Error general.
     *
     */
    @Override
    public void deleteModelo(int id) throws Exception {
        int ModeloBorrado = 0;
        try {
            this.openConexion();
            String sql = "DELETE FROM MODELOS WHERE ID = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ModeloBorrado = ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            throw new Exception(EXC_MENSG1);
        } catch (SQLException ex) {
            ErroresBasedatos(ex);
        } finally {
            this.closeConexion();
        }
        if (ModeloBorrado == 0) {
            throw new Exception(EXC_MENSG4);
        }

    }

    /**
     * Sobreescritura del Método updateModelo.
     *
     * Este método actualiza los datos de un Modelo.
     *
     * @param modelo Modelo de Vehículo.
     * @throws Exception Error general.
     */
    @Override
    public void updateModelo(Modelo modelo) throws Exception {
        try {
            this.openConexion();
            String sql = "UPDATE MODELOS SET ID_MARCA=?, MODELO=?, CONSUMO=?, EMISIONES=?, C_ENERGETICA=? WHERE ID=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, modelo.getIdMarca());
            ps.setString(2, modelo.getNombreModelo());
            ps.setFloat(3, modelo.getConsumoModelo());
            ps.setFloat(4, modelo.getEmisionesModelo());
            ps.setString(5, modelo.getClaEner());
            ps.setInt(6, modelo.getId());
            ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            throw new Exception(EXC_MENSG1);
        } catch (SQLException ex) {
            ErroresBasedatos(ex);
        } finally {
            this.closeConexion();
        }
    }

    /**
     * Sobreescritura del método findIdMarca.
     *
     * Hace una busqueda de todos los modelos de una marca concreta
     *
     * @param idMarca Identificador de la marca.
     * @return modelos Listado de modelos cuya marca coincide con la indicada.
     * @throws Exception Error general.
     */
    @Override
    public List<Modelo> findIdMarca(int idMarca) throws Exception {
        List<Modelo> modelos = new ArrayList();
        Modelo modelo = null;
        try {

            this.openConexion();
            String sql = "SELECT * FROM MODELOS WHERE ID_MARCA=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMarca);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelo = new Modelo(rs.getInt("ID"), rs.getInt("ID_MARCA"), rs.getString("MODELO"), rs.getFloat("CONSUMO"), rs.getFloat("EMISIONES"), rs.getString("C_ENERGETICA"));
                modelos.add(modelo);
            }
        } catch (ClassNotFoundException ex) {
            throw new Exception(EXC_MENSG1);
        } catch (SQLException ex) {
            ErroresBasedatos(ex);
        } finally {
            this.closeConexion();
        }
        return modelos;
    }

    /**
     * Sobreescritura del método findAllModelo.
     *
     * Busca todos los registros de la tabla modelos y los devuelve.
     *
     * @return Devuelve todos los modelos.
     * @throws Exception Error general.
     */
    @Override
    public List<Modelo> findAllModelo() throws Exception {
        List<Modelo> modelos = new ArrayList<>();
        Modelo modelo = null;

        try {
            this.openConexion();
            String sql = "SELECT * FROM MODELOS";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                modelo = new Modelo(rs.getInt("ID"), rs.getInt("ID_MARCA"), rs.getString("MODELO"), rs.getFloat("CONSUMO"), rs.getFloat("EMISIONES"), rs.getString("C_ENERGETICA"));
                modelos.add(modelo);
            }
        } catch (ClassNotFoundException ex) {
            throw new Exception(EXC_MENSG1);
        } catch (SQLException ex) {
            ErroresBasedatos(ex);
        } finally {
            this.closeConexion();
        }
        return modelos;
    }

    /**
     * Método ErroresBasedatos
     *
     * Este método recoge erroes SQL y lanza una excepción con un mensaje
     * concreto.
     *
     * @param e Error de Sql de la ha dado la base de datos.
     * @throws Exception Error general.
     */
    public static void ErroresBasedatos(SQLException e) throws Exception {
        e.printStackTrace();

        switch (e.getErrorCode()) {
            case 0:
                throw new Exception(EXC_MENSG1);

            default:
                throw new Exception(EXC_MENSG3);
        }
    }
}
