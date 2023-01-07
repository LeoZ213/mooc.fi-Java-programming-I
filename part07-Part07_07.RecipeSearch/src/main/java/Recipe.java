import java.util.ArrayList;
public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;
    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }
    public String getName() {
        return this.name;
    }
    public int getTime() {
        return this.time;
    }
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    public boolean containsIngredient(String ingr) {
        for (String i : this.ingredients) {
            if (i.equals(ingr)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return getName() + ", cooking time: " + getTime();
    }
    public void addToIngredients(String ingr) {
        this.ingredients.add(ingr);
    }

}
