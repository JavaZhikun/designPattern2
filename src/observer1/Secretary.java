package observer1;

import java.util.ArrayList;
import java.util.List;

public class Secretary
{
	public  List<StockObserver> observers = new ArrayList<StockObserver>();
	public String action;
	
	public void attach(StockObserver observer)
	{
		observers.add(observer);
	}

	public void notify1()
	{
		for(StockObserver o: observers)
		{
			o.update();
		}
	}
	
	public String getAction()
	{
		return action;
	}
	
	public void setAction(String action)
	{
		this.action = action;
	}
}
