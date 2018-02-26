package sample;
import javafx.fxml.FXML;

import java.util.ArrayList;
import java.util.HashMap;

public class  Receta {
    protected String nombre;
    protected String descripcion;
    private HashMap <Ingrediente, Integer> ingredientes;
    private ArrayList<String> receta = new ArrayList<String>();
    public Receta(String titol, String descripcio) {
        this.nombre = titol;
        this.descripcion = descripcio;
        this.ingredientes = new HashMap<Ingrediente, Integer>();
    }

    public void añadeIngrediente(Ingrediente ingrediente, Integer cantidad) {
        ingredientes.put(ingrediente,cantidad);
    }
    }

