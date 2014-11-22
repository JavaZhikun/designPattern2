package workState_stateTemplate;

public class RestState extends State
{
	public void writeProgram(Work w) 
	{
		System.out.println("当前时间：" + w.hour + "点下班回家了。");
	};

}
