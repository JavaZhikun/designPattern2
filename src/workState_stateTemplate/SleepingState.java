package workState_stateTemplate;

public class SleepingState extends State
{
	@Override
	public void writeProgram(Work w)
	{
		System.out.println("��ǰʱ�䣺"+ w.hour + "�㲻���ˣ�˯����");
	}
}
