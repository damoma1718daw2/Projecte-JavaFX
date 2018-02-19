package sample;

public abstract class Ingrediente {
    private int precio;
    private String nombre;
    private Unidadmedida unidad_medida;
    public enum Unidadmedida {gramos, litros, unidades, paquetes}
    public Ingrediente(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
