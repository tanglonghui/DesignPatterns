package BehavioralPatterns.ChainOfResponsibility;

class LeaveRequest{
	//假条类
	private String leaveName;
	private int leaveDay;
	public LeaveRequest(String leaveName,int leaveDay) {
		// TODO Auto-generated constructor stub
		this.leaveDay=leaveDay;
		this.leaveName=leaveName;
	}
	public int getLeaveDay() {
		return leaveDay;
	}
	public String getLeaveName() {
		return leaveName;
	}
	public void setLeaveDay(int leaveDay) {
		this.leaveDay = leaveDay;
	}
	public void setLeaveName(String leaveName) {
		this.leaveName = leaveName;
	}
}
