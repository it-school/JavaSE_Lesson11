package ClassWork_v3;

public class Cafee
{
	public static void main(String[] args)
	{
		Ingredient coffee = new Ingredient("Coffee", 2, Measurement.spoons, "from Brasil");
		Ingredient sugar = new Ingredient("Sugar", 1, Measurement.spoons, "from Ukraine");
		Ingredient milk = new Ingredient("Milk", 30, Measurement.grammes, "from Ukraine");

		System.out.println(coffee);
		sugar.setQuantity(3);
		Meal cofeeWithMilk = new Meal("Coffe with milk", 50, "", 5, 30, coffee, sugar, milk);
		cofeeWithMilk.addIngredient(new Ingredient("Sugar 2X", 2, Measurement.spoons, ""));
		cofeeWithMilk.setTime(6);
		System.out.println(cofeeWithMilk);

		System.out.println("\n ------------- MENU -------------\n");
		Menu menu = new Menu();
		menu.addMenuItem(cofeeWithMilk);
		menu.addMenuItem(new Meal("Coffee with cream",
						80,
						"...",
						5,
						50,
						new Ingredient("Coffee", 1, Measurement.spoons, "Nikaragua"),
						new Ingredient("Cuba sugar", 1, Measurement.ones, "from Cuba"),
						new Ingredient("Cream", 50, Measurement.grammes, " fat - 20%")
				)
		);

		System.out.println(menu);

		Order order = new Order();
//		order.addOrderItem(menu.menuItems.get(0));
		order.addOrderItem(menu.findByName("cream"));
		order.addOrderItem(menu.findByName("milk"));
		System.out.println(order);
	}
}
