package workState_stateTemplate;

public class SleepingState extends State
{
	@Override
	public void writeProgram(Work w)
	{
		System.out.println("当前时间："+ w.hour + "点不行了，睡着了");
	}
}
