package BehavioralPatterns.State;

class StateA extends State{

	public StateA(Context s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	void say() {
		// TODO Auto-generated method stub
		System.out.println("我是普通会员，我充了："+price);
	}


}
