package homework.v1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;

public class Order
{
	private int id;
	private Calendar time;
	private ArrayList<Meal> meals;
	private boolean isFinished;

	public Order()
	{
		meals = new ArrayList<>();
		this.time = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		this.isFinished = false;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Calendar getTime()
	{
		return time;
	}

	public void setTime(Calendar time)
	{
		this.time = time;
	}

	public ArrayList<Meal> getMeals()
	{
		return meals;
	}

	public void setMeals(ArrayList<Meal> meals)
	{
		this.meals = meals;
	}

	public boolean isFinished()
	{
		return isFinished;
	}

	public void setFinished(boolean finished)
	{
		isFinished = finished;
	}

	public void Add(Meal meal)
	{
		this.meals.add(meal);
	}

	public void Remove(String title)
	{
		for (int i = 0; i < meals.size(); i++) {
			if (title.trim().equalsIgnoreCase(meals.get(i).getTitle().trim())) {
				meals.remove(i);
			}
		}
	}

	@Override
	public String toString()
	{
		String result = "";

		for (Meal meal : meals) {
			result += "\n" + meal;
		}

		return "Order#" + id +
				", " + time.getTime() +
				result +
				"\nisFinished=" + isFinished;
	}
}