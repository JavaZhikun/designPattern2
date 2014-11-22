package observer2;

public abstract class Observer
{
	public String name;
	public Subject sub;
	
	public Observer(String name, Subject sub)
	{
		this.name = name;
		this.sub = sub;
	}
	
	public abstract void update();
	
}
