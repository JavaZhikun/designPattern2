package workState_stateTemplate;

public class ForcedToGetOff extends State
{
	@Override
	public void writeProgram(Work w)
	{
		System.out.println("��ǰʱ��" + w.hour + "���Ͼŵ�֮��ǿ���°�");
	}
}
