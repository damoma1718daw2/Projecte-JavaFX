package sample.Ingredientes.Carnes;

import sample.Ingredientes.Carne;

public class Ternera extends Carne{

        public Ternera(double precio, String nombre) {
            super(precio, nombre);
            this.setPrecio(3);
            this.setNombre("ternera");
        }
    }

