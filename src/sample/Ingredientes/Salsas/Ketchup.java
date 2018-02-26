package sample.Ingredientes.Salsas;

import sample.Ingrediente;

public class Ketchup extends Ingrediente {
    public Ketchup(double precio, String nombre) {
        super(precio, nombre);
        this.setPrecio(0.2);
        this.setNombre("ketchup");
    }
}
