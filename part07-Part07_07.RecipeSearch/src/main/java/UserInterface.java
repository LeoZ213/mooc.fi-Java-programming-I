import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipes;
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipes = new ArrayList<>();
    }
    public void start() {
        System.out.println("File to read: ");
        String file = scanner.nextLine();
        createRecipes(file);
        askForInputs();
        System.out.println(recipes.get(0).getIngredients().toString());
    }
    public void createRecipes(String file) {
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String recipeName = fileReader.nextLine();
                int recipeTime = Integer.valueOf(fileReader.nextLine());
                Recipe recipe = new Recipe(recipeName, recipeTime, new ArrayList<String>());

                recipes.add(recipe);

                while (fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();

                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addToIngredients(ingredient);
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void askForInputs() {
        listCommands();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            if (input.equals("list")) {
                System.out.println("Recipes: ");
                for (Recipe r : this.recipes) {
                    System.out.println(r);
                }
            }
            if (input.equals("find name")) {
                System.out.println("Searched word:");
                String word = scanner.nextLine();
                System.out.println("Recipes: ");
                for (Recipe r: this.recipes) {
                    if (r.getName().contains(word)) {
                        System.out.println(r);
                    }
                }
            }
            if (input.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                System.out.println("Recipes:");
                for (Recipe r : this.recipes) {
                    if (r.getTime() <= time) {
                        System.out.println(r);
                    }
                }
            }
            if (input.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingr = scanner.nextLine();
                System.out.println("Recipe: ");
                for (Recipe r : this.recipes) {
                    if (r.containsIngredient(ingr)) {
                        System.out.println(r);
                    }
                }
            }
        }
    }
    private void listCommands() {
        System.out.println("Commands: "
                + "\n" + "list - lists the recipes"
                + "\n" + "stop - stops the program"
                + "\n" + "find name - searches recipes by name"
                + "\n" + "find cooking time - searches recipes by cooking time"
                + "\n" + "find ingredient - searches recipes by ingredient");
    }
}
