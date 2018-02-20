package sample;

public abstract class Ingrediente {
    private double precio;
    private String nombre;
    private Unidadmedida unidad_medida;
    public enum Unidadmedida {gramos, litros, unidades, paquetes}

    public Ingrediente(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
