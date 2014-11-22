package observer3_delegate;



public class StockObserver
{
	private String name;
	private Subject sub;
	
	public StockObserver(String name, Subject sub)
	{
		this.name = name;
		this.sub = sub;
	}
	
	public void CloseStockMarket()
	{
		System.out.println(sub.getSubjectState() + name +"�رչ�Ʊ���飬��������");
	}

}
