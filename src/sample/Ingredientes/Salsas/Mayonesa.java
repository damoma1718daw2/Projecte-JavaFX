package sample.Ingredientes.Salsas;

import sample.Ingrediente;

public class Mayonesa extends Ingrediente {
    public Mayonesa(double precio, String nombre) {
        super(precio, nombre);
        this.setPrecio(0.2);
        this.setNombre("mayonesa");
    }
}
