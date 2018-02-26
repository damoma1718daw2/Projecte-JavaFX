package sample.Ingredientes.Panes;

import sample.Ingredientes.Pan;

public class Molde extends Pan {
    public Molde(double precio, String nombre) {
        super(precio, nombre);
        this.setPrecio(1);
        this.setNombre("pan molde");
    }
}
