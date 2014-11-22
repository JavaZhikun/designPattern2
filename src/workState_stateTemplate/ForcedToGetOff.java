package workState_stateTemplate;

public class ForcedToGetOff extends State
{
	@Override
	public void writeProgram(Work w)
	{
		System.out.println("当前时间" + w.hour + "晚上九点之后，强制下班");
	}
}
