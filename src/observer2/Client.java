package observer2;

public class Client
{
     public static void main(String[] args)
	{
		Boss huhansan = new Boss();
		
		//看股票的同事
		StockObserver tongshi1 = new StockObserver("围观者",huhansan);
		StockObserver tongshi2 = new StockObserver("易观查",huhansan);
		
//		//看NBA的同事
//		NBAObserver  tongshi2 = new NBAObserver("易观查", huhansan);
		
		huhansan.attach(tongshi1);
		huhansan.attach(tongshi2);
		
		huhansan.detach(tongshi1);
		
		huhansan.setSubjectState("我胡汉三回来了");
		
		huhansan.inform();
		
	    
	}

}
