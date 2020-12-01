package ClassWork_v3;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;

public class Meal
{
	private String name;
	private int calories;
	private String description;
	private int time;
	private double price;
	private ArrayList<Ingredient> ingredients;

	public Meal()
	{
		ingredients = new ArrayList<>();
	}

	public Meal(String name, int calories, String description, int time, double price)
	{
		this.setName(name);
		this.setCalories(calories);
		this.description = description;
		this.setTime(time);
		this.setPrice(price);
	}

	public Meal(String name, int calories, String description, int time, double price, Ingredient... ingredient)
	{
		this.setName(name);
		this.setCalories(calories);
		this.description = description;
		this.setTime(time);
		this.setPrice(price);
		this.ingredients = new ArrayList<>(ingredient.length);
		for (int i = 0; i < ingredient.length; i++) {
			ingredients.add(ingredient[i]);
		}
	}

	public Meal(Ingredient... ingredient)
	{
		this.ingredients = new ArrayList<>(ingredient.length);
		for (int i = 0; i < ingredient.length; i++) {
			ingredients.add(ingredient[i]);
		}
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	}

	public int getCalories()
	{
		return calories;
	}

	public void setCalories(int calories)
	{
		this.calories = Math.abs(calories);
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public int getTime()
	{
		return time;
	}

	public void setTime(int time)
	{
		this.time = time <= 0 ? 5 : time;
	}

	@Override
	public String toString()
	{
		return name + '{' +
				calories +
				" cal, description: '" + description + '\'' +
				", preparation time: " + time +
				" min, ingredients: " + ingredients +
				", price: " + price + Currency.getInstance(Locale.getDefault()).getSymbol() + " hrn.}";
	}

	public ArrayList<Ingredient> getIngredients()
	{
		return ingredients;
	}

	public void addIngredient(Ingredient ingredient)
	{
		this.ingredients.add(ingredient);
	}
}
