package sample.Ingredientes.Panes;

import sample.Ingredientes.Pan;

public class Hamburguesa extends Pan {
    public Hamburguesa(double precio, String nombre) {
        super(precio, nombre);
        this.setPrecio(1.5);
        this.setNombre("pan hamburguesa");
    }
}
