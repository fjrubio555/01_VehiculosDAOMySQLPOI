/*
 * Clase Modelo de Vehículo.
 */
package tz.franrubio.vehiculos.model;

/**
 *
 * @author Francisco J. Rubio
 */
public class Modelo {
    private int id;
    private int idMarca;
    private String nombreModelo;
    private float consumoModelo;
    private float emisionesModelo;
    private String claEner;
    

    public Modelo(int id, int idMarca, String nombreModelo, float consumoModelo, float emisionesModelo, String claEner) {
        this.id = id;
        this.idMarca = idMarca;
        this.nombreModelo = nombreModelo;
        this.consumoModelo = consumoModelo;
        this.emisionesModelo = emisionesModelo;
        this.claEner = claEner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public float getConsumoModelo() {
        return consumoModelo;
    }

    public void setConsumoModelo(float consumoModelo) {
        this.consumoModelo = consumoModelo;
    }

    public float getEmisionesModelo() {
        return emisionesModelo;
    }

    public void setEmisionesModelo(float emisionesModelo) {
        this.emisionesModelo = emisionesModelo;
    }

    public String getClaEner() {
        return claEner;
    }

    public void setClaEner(String claEner) {
        this.claEner = claEner;
    }

    
    
    
}
