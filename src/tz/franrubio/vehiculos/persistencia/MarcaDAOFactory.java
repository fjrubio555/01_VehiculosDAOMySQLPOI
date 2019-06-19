/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tz.franrubio.vehiculos.persistencia;

/**
 *
 * @author xXx
 */
public class MarcaDAOFactory {
    public MarcaDAO getMarcaDAO(){
        return new MarcaDAOMySQLImpl();
    }
}
