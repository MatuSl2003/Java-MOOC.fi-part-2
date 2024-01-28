/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private String name;
    private int cookTime;
    private List<String> ingredients;
            
    public Recipe(String name, int cookTime, List<String> ingredients) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
    
    public String getName() {
        return name;
    }

    public int getCookTime() {
        return cookTime;
    }

    public String toString() {
        return this.name + ", cooking time: " + this.cookTime;
    }

}
