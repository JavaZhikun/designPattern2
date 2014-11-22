package observer1;

public class Client
{
	public static void main(String[] args)
	{
		Secretary tongzizhe = new Secretary();
		
		//看股票的同事
		StockObserver tongshi1 = new StockObserver("围观者",tongzizhe);
		StockObserver tongshi2 = new StockObserver("易管查",tongzizhe);
		
		//前台记下了两位同事
		tongzizhe.attach(tongshi1);
		tongzizhe.attach(tongshi2);
		
		tongzizhe.action = "老板回来了！";
		
		tongzizhe.notify1();
		
	}

}
