package workState_stateTemplate;

public class EveningState extends State
{
	@Override
	public void writeProgram(Work w)
	{
		if(w.getTaskFinished())
		{
			w.setState(new RestState());
			w.writeProgram();
		}
		else
		{
			if(w.hour < 21)
			{
				System.out.println("��ǰʱ��"+ w.hour +"�㣬�Ӱ�Ŷ��ƣ������");
			}
			else
			{
				w.setState(new ForcedToGetOff());
				w.writeProgram();
			}
		}
		
	}

}
