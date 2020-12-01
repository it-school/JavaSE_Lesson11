package ClassWork_v3;

import java.util.ArrayList;

public class Menu
{
	ArrayList<Meal> menuItems;

	public Menu()
	{
		menuItems = new ArrayList<>();
	}

	public void addMenuItem(Meal meal)
	{
		menuItems.add(meal);
	}

	@Override
	public String toString()
	{
		return "Menu{" +
				"menuItems=" + menuItems +
				'}';
	}

	public Meal findByName(String name)
	{
		for (Meal meal : menuItems) {
			if (meal.getName().toLowerCase().contains(name.toLowerCase())) { return meal; }
		}

		return null;
	}
}
