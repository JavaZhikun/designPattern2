package observer2;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject
{
	//ͬ���б�
	public List<Observer> observers = new ArrayList<Observer>();
	private String action;
	
	
	//����
	public void attach(Observer observer)
	{
		observers.add(observer);
	}
	
	//����
	public void detach(Observer observer)
	{
		observers.remove(observer);
	}
	
	//֪ͨ
	public void inform()
	{
		for(Observer o : observers)
		{
			o.update();
		}
	}
	
	//�ϰ�״̬
	public String getSubjectState()
	{
		return action;
	}
	
	public void setSubjectState(String action)
	{
		this.action = action;
		
	}




}
