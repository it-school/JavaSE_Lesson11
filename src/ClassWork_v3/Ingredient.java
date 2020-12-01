package ClassWork_v3;

public class Ingredient
{
	private String name;
	private double quantity;
	private Measurement units;
	private String description;

	public Ingredient(String name, double quantity, Measurement units, String description)
	{
		this.setName(name);
		this.setQuantity(quantity);
		this.setUnits(units);
		this.setDescription(description);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getQuantity()
	{
		return quantity;
	}

	public void setQuantity(double quantity)
	{
		this.quantity = Math.abs(quantity);
	}

	public Measurement getUnits()
	{
		return units;
	}

	public void setUnits(Measurement units)
	{
		this.units = units;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	@Override
	public String toString()
	{
		return name + " (" + quantity + " " + units + ", " + description + ')';
	}
}
