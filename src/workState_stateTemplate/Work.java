package workState_stateTemplate;

public class Work
{
	private State current;
	
	public Work()
	{
		current = new ForenoonState();
	}
	
	public double hour;
	public double getHour()
	{
		return hour;
	}
	public void setHour(double hour)
	{
		this.hour = hour;
	}
	
	public boolean finish = false;
	
	public boolean getTaskFinished()
	{
		return finish;
	}
	public void setTastFinished(boolean finish)
	{
		this.finish = finish;
	}
	
	public void setState(State s)
	{
		current = s;
	}
	
	public void writeProgram()
	{
		current.writeProgram(this);
	}

}
