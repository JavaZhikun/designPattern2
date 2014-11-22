package workState_stateTemplate;




//午前状态
public class ForenoonState extends State
{
	public void writeProgram(Work w) 
	{
		if(w.hour < 12)
		{
			System.out.println("当前时间:" + w.hour + "点，上午工作，精神百倍") ;
		}
		else
		{
			w.setState(new NoonState());
			w.writeProgram();
		}
	};
	

}
