package BehavioralPatterns.State;

class StateC extends State{

	public StateC(Context s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	void say() {
		// TODO Auto-generated method stub

		System.out.println("我是砖石会员，我充了："+price);
	}


}
