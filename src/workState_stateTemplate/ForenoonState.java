package workState_stateTemplate;




//��ǰ״̬
public class ForenoonState extends State
{
	public void writeProgram(Work w) 
	{
		if(w.hour < 12)
		{
			System.out.println("��ǰʱ��:" + w.hour + "�㣬���繤��������ٱ�") ;
		}
		else
		{
			w.setState(new NoonState());
			w.writeProgram();
		}
	};
	

}
