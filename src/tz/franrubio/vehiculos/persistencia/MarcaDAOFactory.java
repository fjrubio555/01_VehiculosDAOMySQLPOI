/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tz.franrubio.vehiculos.persistencia;

/**
 * Clase MarcaDAOFactory
 *
 * Esta clase nos indica que tipo de implementación vamos a utilizar en este
 * caso va ser una base de datos.
 *
 * @author Francisco J. Rubio
 */
public class MarcaDAOFactory {

    public MarcaDAO getMarcaDAO() {
        return new MarcaDAOMySQLImpl();
    }
}
