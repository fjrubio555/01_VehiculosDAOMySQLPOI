package tz.franrubio.vehiculos.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import tz.franrubio.vehiculos.model.Marca;
import static tz.franrubio.vehiculos.persistencia.ModeloDAOMySQLImpl.*;

/**
 * Clase MarcaDAOMySQLImpl
 *
 * Esta clase hereda de la clase BBDDManager e implementa los métodos
 * adicionales de la MarcaDAO.
 *
 * @author Francisco J. Rubio
 * @version 1.0
 * @since 27/06/2018
 */
public class MarcaDAOMySQLImpl extends BBDDManager implements MarcaDAO {

    /**
     * addMarca
     *
     * Añade una marca nueva a la base de datos sino existe.
     *
     * @param _marca Marca de un modelo.
     * @throws Exception Error general.
     */
    @Override
    public void addMarca(Marca _marca) throws Exception {
        try {
            String sql = null;
            this.openConexion();
            sql = "SELECT * FROM MARCAS WHERE ID=? && UPPER(RTRIM(MARCA))=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, _marca.getId());
            ps.setString(2, _marca.getMarca().trim().toUpperCase());
            ResultSet rs = ps.executeQuery();
            if (!rs.first()) {
                sql = "INSERT INTO MARCAS (ID, MARCA) VALUE (?,?)";
                ps = con.prepareStatement(sql);
                ps.setInt(1, _marca.getId());
                ps.setString(2, _marca.getMarca().trim());
                ps.executeUpdate();
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
     * deleteMarca
     *
     * Elimina una marca de la base de datos.
     *
     * @param _id Identificador de la marca.
     * @throws Exception Error general.
     */
    @Override
    public void deleteMarca(int _id) throws Exception {
        int MarcaBorrado = 0;
        String sql = null;
        try {

            this.openConexion();
            sql = "DELETE FROM MARCAS WHERE ID=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, _id);
            MarcaBorrado = ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            throw new Exception(EXC_MENSG1);
        } catch (SQLException ex) {
            ErroresBasedatos(ex);
        } finally {
            this.closeConexion();
        }
        if (MarcaBorrado == 0) {
            throw new Exception();
        }
    }

    /**
     * Sobreescritura getAlMarca
     *
     * Este método accede a la base de datos, busca todas las marcas y las envia
     * a un array.
     *
     *
     * @return mascas Array con todas la tabla marcas.
     * @throws ClassNotFoundException Errores de conexion.
     * @throws SQLException Errores de base de datos.
     */
    @Override
    public ArrayList<Marca> getAllMarca() throws Exception {
        ArrayList<Marca> marcas = new ArrayList<>();
        Marca marca = null;
        try {
            String sql = null;
            this.openConexion();
            sql = "SELECT * FROM MARCAS";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                marca = new Marca(rs.getInt("ID"), rs.getString("MARCA"));
                marcas.add(marca);
            }
        } catch (ClassNotFoundException ex) {
            throw new Exception(EXC_MENSG1);
        } catch (SQLException ex) {
            ErroresBasedatos(ex);
        } finally {
            this.closeConexion();
        }
        return marcas;
    }

    /**
     * Sobreescritura findIdMarca
     *
     * Dado un identifiador seleccionar una marca concreta de la tabla marcas de
     * la base de datos.
     *
     * @param _id Identificador de la tabla marcas de la base de datos.
     * @return Una marca.
     * @throws Exception Error general.
     */
    @Override
    public String findIdMarca(int _id) throws Exception {
        String marca = null;
        String sql = null;
        try {
            this.openConexion();
            sql = "SELECT MARCA FROM MARCAS WHERE ID =?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, _id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                marca = rs.getString("MARCA");
            }

            this.closeConexion();
        } catch (ClassNotFoundException ex) {
            throw new Exception(EXC_MENSG1);
        } catch (SQLException ex) {
            ErroresBasedatos(ex);
        } finally {
            this.closeConexion();
        }

        return marca;
    }

    /**
     * *
     *
     * Sobreescritura del método updateMarca de la interfaz MarcaDAO.
     *
     * Dado un identificador actualiza los cambios.
     *
     * @param _marca Identificador de la marca de la base de datos.
     * @throws Exception Error general.
     */
    @Override
    public void updateMarca(Marca _marca) throws Exception {
        String sql = null;
        try {
            this.openConexion();
            sql = "UPDATE MARCAS SET MARCA=? WHERE ID=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, _marca.getMarca());
            ps.setInt(2, _marca.getId());
            ps.executeUpdate();

        } catch (ClassNotFoundException ex) {
            throw new Exception(EXC_MENSG1);
        } catch (SQLException ex) {
            ErroresBasedatos(ex);
        } finally {
            this.closeConexion();
        }

    }

}
