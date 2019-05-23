package BehavioralPatterns.ChainOfResponsibility;

class ConcreteHandlerA extends Handler{

	public ConcreteHandlerA(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		if(leaveRequest.getLeaveDay()<10) {
			System.out.println("A批准了");
		}else {
			this.handler.handleRequest(leaveRequest);
		}
	}

}
