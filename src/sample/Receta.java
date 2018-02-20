package sample;
import java.util.HashMap;

public abstract class  Receta {

    protected String nombre;
    protected String descripcion;
    private HashMap <Ingrediente, Integer> ingredientes;

    public Receta(String titol, String descripcio) {
        this.nombre = titol;
        this.descripcion = descripcio;
        this.ingredientes = new HashMap<Ingrediente, Integer>();
    }

    public void añadeIngrediente(Ingrediente ingrediente, Integer cantidad) {
        ingredientes.put(ingrediente,cantidad);
    }
    }

