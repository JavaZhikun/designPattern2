package observer1;

public class Client
{
	public static void main(String[] args)
	{
		Secretary tongzizhe = new Secretary();
		
		//����Ʊ��ͬ��
		StockObserver tongshi1 = new StockObserver("Χ����",tongzizhe);
		StockObserver tongshi2 = new StockObserver("�׹ܲ�",tongzizhe);
		
		//ǰ̨��������λͬ��
		tongzizhe.attach(tongshi1);
		tongzizhe.attach(tongshi2);
		
		tongzizhe.action = "�ϰ�����ˣ�";
		
		tongzizhe.notify1();
		
	}

}
