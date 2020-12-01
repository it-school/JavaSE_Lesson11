package ClassWork_v1;

import java.util.ArrayList;

public class Orders
{
	private final ArrayList<Order> orders;
	private int counter;

	public Orders()
	{
		orders = new ArrayList<>();
		counter = 0;
	}

	public void Remove(int id)
	{
		for (int i = 0; i < orders.size(); i++) {
			if (id == orders.get(i).getId()) { orders.remove(i); }
		}
	}

	public void Finish(int id)
	{
		for (int i = 0; i < orders.size(); i++) {
			if (id == orders.get(i).getId()) {
				orders.get(i).setFinished(true);
				return;
			}
		}
	}

	public Orders Search(String byIngredientTitle)
	{
		Orders tempOrders = new Orders();

f1:
		for (int i = 0; i < orders.size(); i++) {
			for (Meal meal : orders.get(i).getMeals()) {
				for (Ingredient4Meal imeal : meal.getIngredients()) {
					if (imeal.getIngredient().getTitle().trim().toLowerCase().equals(byIngredientTitle.trim().toLowerCase())) {
						tempOrders.Add(orders.get(i));
						continue f1;
					}
				}
			}

		}


		return tempOrders;
	}

	public void Add(Order order)
	{
		order.setId(++counter);
		orders.add(order);
	}

	@Override
	public String toString()
	{
		String result = "";

		for (Order order : orders) {
			result += "\n" + order;
		}

		return result;
	}
}