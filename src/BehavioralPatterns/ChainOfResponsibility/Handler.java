package BehavioralPatterns.ChainOfResponsibility;

abstract class Handler{
	protected String name;
	protected Handler handler;
	public Handler(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	public void setHanglder(Handler handler) {
		this.handler = handler;
	}
	public abstract void handleRequest(LeaveRequest leaveRequest);
}
