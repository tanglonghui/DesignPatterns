package BehavioralPatterns.ChainOfResponsibility;

class ConcreteHandlerC extends Handler{

	public ConcreteHandlerC(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		if(leaveRequest.getLeaveDay()>=20) {
			System.out.println("C批准了");
		}else {
			this.handler.handleRequest(leaveRequest);
		}
	}

}
