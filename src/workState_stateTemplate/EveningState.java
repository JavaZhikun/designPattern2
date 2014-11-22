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
				System.out.println("当前时间"+ w.hour +"点，加班哦，疲累至极");
			}
			else
			{
				w.setState(new ForcedToGetOff());
				w.writeProgram();
			}
		}
		
	}

}
