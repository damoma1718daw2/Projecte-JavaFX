package sample.Ingredientes.Quesos;

import sample.Ingredientes.Queso;

public class Cheddar extends Queso {
    public Cheddar(double precio, String nombre) {
        super(precio, nombre);
        this.setPrecio(1);
        this.setNombre("queso cheddar");
    }
}
