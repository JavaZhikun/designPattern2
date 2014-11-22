package workState_stateTemplate;

public class NoonState extends State
{
	public void writeProgram(Work w)
	{
		if(w.hour < 13)
		{
			System.out.println("当前时间：" + w.hour + "点， 饿了，午饭；犯困，午休");
		}
		
		else
		{
			w.setState(new AfternoonState());
			w.writeProgram();
		}

	}

}

