package sample.Hamburguesas;

import sample.Ingredientes.Carne;
import sample.Ingredientes.Carnes.Ternera;
import sample.Ingredientes.Panes.Hamburguesa;
import sample.Ingredientes.Quesos.Cheddar;
import sample.Receta;

public abstract class BurgerKangreburger extends Receta {
    public BurgerKangreburger() {
        super("BurgerKangreburger","Una hambuerguesa normal");
        this.añadeIngrediente(new Cheddar(0.5,"Cheddar"), 1);
        this.añadeIngrediente(new Hamburguesa(0.5,"Hamburguesa"), 1);
        this.añadeIngrediente(new Ternera(2,"Ternera"), 1);
    }






}
