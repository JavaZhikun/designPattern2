package observer2;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject
{
	//同事列表
	public List<Observer> observers = new ArrayList<Observer>();
	private String action;
	
	
	//增加
	public void attach(Observer observer)
	{
		observers.add(observer);
	}
	
	//减少
	public void detach(Observer observer)
	{
		observers.remove(observer);
	}
	
	//通知
	public void inform()
	{
		for(Observer o : observers)
		{
			o.update();
		}
	}
	
	//老板状态
	public String getSubjectState()
	{
		return action;
	}
	
	public void setSubjectState(String action)
	{
		this.action = action;
		
	}




}
