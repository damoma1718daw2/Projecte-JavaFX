package sample.Ingredientes;

import sample.Ingrediente;

public class Bacon extends Ingrediente {
    public Bacon(double precio, String nombre) {
        super(precio, nombre);
        this.setPrecio(0.8);
        this.setNombre("bacon");
    }
}
