package ClassWork_v1;

public class Ingredient4Meal
{
	private Ingredient ingredient;
	private int quantity;

	public Ingredient4Meal(Ingredient ingredient, int quantity)
	{
		this.ingredient = ingredient;
		this.quantity = quantity;
	}

	public Ingredient getIngredient()
	{
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient)
	{
		this.ingredient = ingredient;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	@Override
	public String toString()
	{
		return ingredient + " - " + quantity;
	}
}