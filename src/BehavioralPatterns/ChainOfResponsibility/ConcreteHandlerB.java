package BehavioralPatterns.ChainOfResponsibility;

class ConcreteHandlerB extends Handler{

	public ConcreteHandlerB(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		if(leaveRequest.getLeaveDay()>=10 && leaveRequest.getLeaveDay()<20) {
			System.out.println("B批准了");
		}else {
			this.handler.handleRequest(leaveRequest);
		}
	}

}
