package homework.v1;

public class Time
{
	private int hours;
	private int minutes;

	public Time(int hours, int minutes)
	{
		try {
			if (minutes > 59) { throw new Exception("Minutes must < 60"); }

			this.hours = hours;
			this.minutes = minutes;
		}
		catch (Exception e) {
			System.out.println(e);
			this.hours = -1;
			this.minutes = -1;
		}
	}

	public Time(String time)
	{
		try {
			String[] times = time.split(":");
			this.hours = Integer.parseInt(times[0]);
			this.minutes = Integer.parseInt(times[1]);
		}
		catch (Exception e) {
			System.out.println(e);
			this.hours = -1;
			this.minutes = -1;
		}
	}


	@Override
	public String toString()
	{
		return hours + ":" + minutes;
	}
}