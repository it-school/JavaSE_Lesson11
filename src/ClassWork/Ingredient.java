package ClassWork;

public class Ingredient
{
	private String title;
	private Measurments measurement;
	private String desc;

	public Ingredient(String title, Measurments measurement, String desc)
	{
		this.title = title;
		this.measurement = measurement;
		this.desc = desc;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public Measurments getMeasurement()
	{
		return measurement;
	}

	public void setMeasurement(Measurments measurement)
	{
		this.measurement = measurement;
	}

	public String getDesc()
	{
		return desc;
	}

	public void setDesc(String desc)
	{
		this.desc = desc;
	}

	@Override
	public String toString()
	{
		return title + ": " + measurement + ",  " + desc;
	}
}