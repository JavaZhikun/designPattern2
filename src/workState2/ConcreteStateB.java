package workState2;

public class ConcreteStateB extends State
{
	@Override
	public void handle(Context context)
	{
		context.setState(new ConcreteStateB());
		
	}

}
