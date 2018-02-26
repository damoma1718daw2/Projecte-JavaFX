package sample.Ingredientes;

import sample.Ingrediente;

public class Pepinillo extends Ingrediente {
    public Pepinillo(double precio, String nombre) {
        super(precio, nombre);
        this.setPrecio(0.5);
        this.setNombre("pepinillos");
    }
}
