package workState2;

public class Context
{ 
	private State state;
	
	public Context(State state)
	{
		this.state = state;
	}
	
	public State getState()
	{
		return state;
	}
	
	public void setState(State state)
	{
		this.state = state;
		System.out.println("��ǰ״̬��" + state);
		
	}
	
	public void request()
	{
		state.handle(this);
	}
	
	

}
