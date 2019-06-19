
package tz.franrubio.vehiculos.model;

/**
 *Clase Marca.
 * @author Francisco J. Rubio
 */
public class Marca {
    private int id;
    private String marca;

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
