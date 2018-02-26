package sample.Ingredientes;

import sample.Ingrediente;

public class Lechuga extends Ingrediente {
    public Lechuga(double precio, String nombre) {
        super(precio, nombre);
        this.setPrecio(0.5);
        this.setNombre("lechuga");
    }
}
