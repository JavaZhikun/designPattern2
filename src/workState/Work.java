package workState;

public class Work
{
	public int hour;
	
	public int getHour()
	{
		return hour;
	}

	public  void setHour(int hour)
	{
		this.hour = hour;
	}
	
	public boolean finish = false;
	
	public boolean getTaskFinished()
	{
		return finish;
	}
	
	public void setTaskFinished(boolean finish)
	{
		this.finish = finish;
	}
	
	public void writeProgram()
	{
		if(hour < 12)
		{
			System.out.println("��ǰʱ�䣺" + hour +"�㣬���繤��������ٱ�");
		}
		
		else if(hour < 13)
		{
			System.out.println("��ǰʱ�䣺" + hour +"�㣬���ˣ��緹�����������ݡ�");
		}
		
		else if(hour < 17)
		{
			System.out.println("��ǰʱ�䣺" + hour +"�㣬����״̬����������Ŭ��");
		}
		
		else
		{
			if(finish)
			{
				System.out.println("��ǰʱ�䣺" + hour +"�㣬�°�ؼ���");
			}
			
			else
			{
				if(hour < 21)
				{
					System.out.println("��ǰʱ�䣺" + hour +"�㣬�Ӱ�Ŷ��ƣ������");
				}
				else
				{
					System.out.println("��ǰʱ�䣺" + hour +"��, �����ˣ�˯����");
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
