package homework.v1;

import java.util.ArrayList;

public class Meal {


    private final double price;
    private String title;
    private ArrayList<Ingredient4Meal> ingredients;
    private String description;
    private int calories;
    private Time time;

    public Meal(String title, ArrayList<Ingredient4Meal> ingredients, String description, int calories, Time minutes,
                double price) {
        this.title = title;
        this.ingredients = ingredients;
        this.description = description;
        this.calories = calories;
        this.time = minutes;
        this.price = price;
    }

    public Meal(String title, String ingredients, String description, int calories, Time minutes,
                double price) {
        this.title = title;
        this.ingredients = new ArrayList<>();
        this.description = description;
        this.calories = calories;
        this.time = minutes;
        this.price = price;

        String[] ings = ingredients.split(",");
        for (int i = 0; i < ings.length; i++) {
            this.ingredients.add(new Ingredient4Meal(new Ingredient(ings[i], Measurements.n_a, ""), 0));
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Ingredient4Meal> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient4Meal> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return title + "{"
                + ingredients +
                ", description='" + description + '\'' +
                ", calories=" + calories +
                ", time=" + time +
                ", price=" + price +
                '}';
    }
}