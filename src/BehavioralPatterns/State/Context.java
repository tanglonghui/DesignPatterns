package BehavioralPatterns.State;

/*
 * 操作入口，
 */
class Context{
	private State state;
	private int price;
	Context(){
		state=new StateA(this);
	}
	void say(){
			state.say();
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
	//模拟冲钱
	public void setPrice(int price) {
		this.price = price;
		state.initState(price);
	}
	public int getPrice() {
		return price;
	}
}
