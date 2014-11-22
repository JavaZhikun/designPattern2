package abstractFactory;

public class SqlserverUser implements User
{
	public void insert(User user)
	{
		System.out.println("在 SQL Server 中给User表增加一条记录");
	}
	
	public User getUser(int id)
	{
		System.out.println("在SQL Server中根据ID得到User表中的一条记录");
		return null;
	}
	

}
