package workState_stateTemplate;

public class NoonState extends State
{
	public void writeProgram(Work w)
	{
		if(w.hour < 13)
		{
			System.out.println("��ǰʱ�䣺" + w.hour + "�㣬 ���ˣ��緹������������");
		}
		
		else
		{
			w.setState(new AfternoonState());
			w.writeProgram();
		}

	}

}

