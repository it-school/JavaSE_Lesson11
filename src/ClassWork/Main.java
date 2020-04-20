package ClassWork;

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		Ingredient i1 = new Ingredient("Sugar", Measurments.чайн_л, "свекольный");
		Ingredient i2 = new Ingredient("Tea", Measurments.чайн_л, "India");
		Ingredient i3 = new Ingredient("Lemon", Measurments.долька, "Эквадор");
		Ingredient i4 = new Ingredient("Coffee", Measurments.чайн_л, "Brasil");

		Ingredient4Meal im1 = new Ingredient4Meal(i1, 2);
		Ingredient4Meal im2 = new Ingredient4Meal(i2, 1);
		Ingredient4Meal im3 = new Ingredient4Meal(i3, 1);
		Ingredient4Meal im4 = new Ingredient4Meal(i4, 2);

		ArrayList<Ingredient4Meal> ings1 = new ArrayList<>();
		ings1.add(im1);
		ings1.add(im2);
		ings1.add(im3);

		ArrayList<Ingredient4Meal> ings2 = new ArrayList<>();
		ings1.add(im1);
		ings1.add(im4);
		ings1.add(im3);

		Meal meal1 = new Meal("Tea", ings1, "Strong and tasty", 10, new Time(0, 1), 20);
		Meal meal2 = new Meal("Coffee", ings1, "Very strong and tasty", 20, new Time(0, 1), 25);
//		System.out.println(meal1);
//		System.out.println(meal2);

		Order order1 = new Order();
		order1.Add(meal1);
		order1.Add(meal2);
		//	System.out.println(order1);

		Order order2 = new Order();
		order2.Add(meal2);
		order2.Add(meal2);
		//	System.out.println(order2);

		Orders orders = new Orders();
		orders.Add(order1);
		orders.Add(order2);

		System.out.println(orders);

		orders.Finish(1);

		System.out.println(orders);

		System.out.println("Orders with tea:\n");
		System.out.println(orders.Search("tea"));

		System.out.println("\n----------------------\n");
		Meal meal3 = new Meal("Roasted eggs", "Egg, butter", "!!!", 200, new Time("1:15"), 100);
		System.out.println(meal3);
	}
}