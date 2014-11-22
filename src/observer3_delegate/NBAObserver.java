package observer3_delegate;

public class NBAObserver
{
	private String name;
	private Subject sub;
	
	public NBAObserver(String name, Subject sub)
	{
		this.name = name;
		this.sub = sub;
	}
	
	//�ر�NBAֱ��
	public void CloseNBADirectSeeding()
	{
		System.out.println(sub.getSubjectState() + name +"�ر�NBAֱ������������");
	}

}
