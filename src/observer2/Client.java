package observer2;

public class Client
{
     public static void main(String[] args)
	{
		Boss huhansan = new Boss();
		
		//����Ʊ��ͬ��
		StockObserver tongshi1 = new StockObserver("Χ����",huhansan);
		StockObserver tongshi2 = new StockObserver("�׹۲�",huhansan);
		
//		//��NBA��ͬ��
//		NBAObserver  tongshi2 = new NBAObserver("�׹۲�", huhansan);
		
		huhansan.attach(tongshi1);
		huhansan.attach(tongshi2);
		
		huhansan.detach(tongshi1);
		
		huhansan.setSubjectState("�Һ�����������");
		
		huhansan.inform();
		
	    
	}

}
