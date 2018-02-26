package sample.Ingredientes.Quesos;

import sample.Ingredientes.Queso;

public class Cabra extends Queso{
    public Cabra(double precio, String nombre) {
        super(precio, nombre);
        this.setPrecio(1);
        this.setNombre("queso cabra");
    }
}
