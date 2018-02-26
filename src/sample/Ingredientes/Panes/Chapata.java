package sample.Ingredientes.Panes;

import sample.Ingredientes.Pan;

public class Chapata extends Pan {
    public Chapata(double precio, String nombre) {
        super(precio, nombre);
        this.setPrecio(2);
        this.setNombre("pan chapata");
    }
}
