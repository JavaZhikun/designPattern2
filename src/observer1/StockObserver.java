package observer1;

public class StockObserver
{
	public  String name;
	public Secretary sub;
	
	public StockObserver(String name, Secretary sub)
	{
		this.name = name;
		this.sub = sub;
	}
	
	public void update()
	{
		System.out.println(sub.action + name +"�رչ�Ʊ����,��������");
	}

}
