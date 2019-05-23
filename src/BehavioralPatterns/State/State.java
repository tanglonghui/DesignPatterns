package BehavioralPatterns.State;

abstract class State{
	protected Context con;
	protected int price;
	abstract void say();
	public State(Context s) {
		// TODO Auto-generated constructor stub
		this.price=s.getPrice();
		con=s;
	}
	protected void initState(int price) {
		if(price>0&&price<10) {
			con.setState(new StateB(con));
		}else if(price>=10) {
			con.setState(new StateC(con));
		}else {
			con.setState(new StateA(con));
		}
}
}
