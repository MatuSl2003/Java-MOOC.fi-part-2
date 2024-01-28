/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<String> recipeList;
    private ArrayList<Integer> cookTimes;
    private ArrayList<Recipe> recipeObjList;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipeList = new ArrayList();
        this.cookTimes = new ArrayList();
        this.recipeObjList = new ArrayList();
    }

    public void start() {
        System.out.print("File to read: ");
        String fileToRead = scanner.nextLine();
        fileToList(fileToRead);
// created recipeList
        for (int i = 0; i < this.recipeList.size(); i++) {
            if (isNumeric(recipeList.get(i))) {
                cookTimes.add(i);
            }
        }
// created cookTimes list
        for (int i = 0; i < cookTimes.size(); i++) {
            if (i < cookTimes.size() - 1) {
                List<String> ingredients = this.recipeList.subList(cookTimes.get(i) + 1, cookTimes.get(i + 1) - 1);
                Recipe recipea = new Recipe(recipeList.get(cookTimes.get(i) - 1), Integer.valueOf(recipeList.get(cookTimes.get(i))), ingredients);
                recipeObjList.add(recipea);
            } else {
                List<String> ingredients = this.recipeList.subList(cookTimes.get(i) + 1, recipeList.size());
                Recipe recipea = new Recipe(recipeList.get(cookTimes.get(i) - 1), Integer.valueOf(recipeList.get(cookTimes.get(i))), ingredients);
                recipeObjList.add(recipea);
            }

        }
//created objects with name, cook time and ingredients
        System.out.println("");
        System.out.println("Commands:\n" + "list - lists the recipes\n" + "stop - stops the program\n" + "find name - searches recipes by name\n" + "find cooking time - searches recipes by cooking time\n" + "find ingredient - searches recipes by ingredient\n");
        while (true) {
            System.out.print("Enter command: ");
            String command = this.scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                list();
            } else if (command.equals("find name")) {
                byName();
            } else if (command.equals("find cooking time")) {
                cookTime();
            } else if (command.equals("find ingredient")) {
                byIngredient();
            }

        }
        //created
    }
    
//////////////////////////////////////////////////////////////////////
    public void fileToList(String fileToRead) {
        try ( Scanner scanFile = new Scanner(Paths.get(fileToRead))) {
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();
                if (row.isEmpty()) {
                    continue;
                }
                this.recipeList.add(row);
            }

        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
    }

    public void list() {
        System.out.println("");
        System.out.println("Recipes:");

        for (Recipe recipe : recipeObjList) {
            System.out.println(recipe);
        }
        System.out.println("");
    }

    public void byIngredient() {
        System.out.print("Ingredient: ");
        String ingredient = scanner.nextLine();
        System.out.println("");
        System.out.println("Recipes:");

        for (Recipe recipe : recipeObjList) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }

    public void cookTime() {
        System.out.print("Max cooking time: ");
        int maxTime = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : recipeObjList) {
            if (recipe.getCookTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }

    public void byName() {
        System.out.print("Searched word: ");
        String word = this.scanner.nextLine();
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : recipeObjList) {
            if (recipe.getName().toLowerCase().contains(word.toLowerCase())) {
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }

    public static boolean isNumeric(String str) {
        try {
            // Attempt to parse the string as an integer
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            // Catch the exception if parsing fails
            return false;
        }
    }
}
