package sample.Ingredientes.Salsas;

import sample.Ingrediente;

public class Barbacoa extends Ingrediente{
    public Barbacoa(double precio, String nombre) {
        super(precio, nombre);
        this.setPrecio(0.2);
        this.setNombre("barbacoa");
    }
}
