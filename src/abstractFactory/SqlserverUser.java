package abstractFactory;

public class SqlserverUser implements User
{
	public void insert(User user)
	{
		System.out.println("�� SQL Server �и�User������һ����¼");
	}
	
	public User getUser(int id)
	{
		System.out.println("��SQL Server�и���ID�õ�User���е�һ����¼");
		return null;
	}
	

}
