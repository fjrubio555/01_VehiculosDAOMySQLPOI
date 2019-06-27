package tz.franrubio.vehiculos.model;

/**
 * Clase Marca.
 *
 * @author Francisco J. Rubio
 * @version 1.0
 * @since 27/06/2018
 */
public class Marca {

    private int id;
    private String marca;

    /**
     * Contructor Marca
     *
     * @param id Identificador de la Marca
     * @param Marca Nombre de la Marca
     */
    public Marca(int id, String Marca) {
        this.id = id;
        this.marca = Marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        this.marca = Marca;
    }

}
