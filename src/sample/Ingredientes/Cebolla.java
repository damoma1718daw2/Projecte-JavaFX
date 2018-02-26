package sample.Ingredientes;

import sample.Ingrediente;

public class Cebolla extends Ingrediente {
    public Cebolla(double precio, String nombre) {
        super(precio, nombre);
        this.setPrecio(0.5);
        this.setNombre("cebolla");
    }
}
