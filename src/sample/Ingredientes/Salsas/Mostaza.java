package sample.Ingredientes.Salsas;

import sample.Ingrediente;

public class Mostaza extends Ingrediente {
    public Mostaza(double precio, String nombre) {
        super(precio, nombre);
        this.setPrecio(0.2);
        this.setNombre("mostaza");
    }
}
