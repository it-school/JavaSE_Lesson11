package WorkClass;

import java.util.ArrayList;

public class Meal implements IMeal {
    private ArrayList<Ingredient> ingredients;
    private String title;
    private double price;

    public Meal(String title, double price) {
        this.title = title;
        setPrice(price);
        this.ingredients = new ArrayList<>();
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price > 0 ? price : -1;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public Ingredient[] getIngredients() {
        return (Ingredient[]) this.ingredients.toArray();
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        if (price <= 0)
            return "Incorrect meal price!";
        return
                this.title + " {" +
                        ingredients + "} - " + this.price;
    }
}
