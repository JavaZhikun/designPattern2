package workState_stateTemplate;

public class AfternoonState extends State
{
	@Override
	public void writeProgram(Work w)
	{
		if(w.hour < 17)
		{
			System.out.println("��ǰʱ�䣺" + w.hour + "�㣬 ���ˣ��緹������������");
		}
		
		else
		{
			w.setState(new EveningState());
			w.writeProgram();
		}
		
	}
	

}
