package ClassWork_v3;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order
{
	private final Timestamp time;
	private boolean isDone;
	ArrayList<Meal> orderItems;

	public Order()
	{
		orderItems = new ArrayList<>();
		this.time = Timestamp.valueOf(LocalDateTime.now());
		this.isDone = false;
	}

	public void addOrderItem(Meal meal)
	{
		orderItems.add(meal);
	}

	@Override
	public String toString()
	{
		double sum = 0;
		for (Meal meal : orderItems) {
			sum += meal.getPrice();
//sum = sum + meal.getPrice();
		}
		return "\nOrder (" + time.toLocalDateTime() + "):\n" + orderItems + "\nsum: " + sum;
	}

	public boolean isDone()
	{
		return isDone;
	}

	public void setDone(boolean done)
	{
		isDone = done;
	}
}
