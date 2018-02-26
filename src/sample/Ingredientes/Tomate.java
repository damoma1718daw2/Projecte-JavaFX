package sample.Ingredientes;

import sample.Ingrediente;

public class Tomate extends Ingrediente {
    public Tomate(double precio, String nombre) {
        super(precio, nombre);
        this.setPrecio(0.5);
        this.setNombre("tomate");
    }
}
