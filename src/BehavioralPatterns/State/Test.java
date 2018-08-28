package BehavioralPatterns.State;
/*
 * 状态模式——允许一个对象在其内部状态改变时自动改变其行为，对象看起来就像是改变了它的类。
 */
/*
 * 包含角色：
 * Context（环境类）：状态持有者
 * State（抽象状态类）
 * ConcreteState（具体状态类）：从环境类中分离的状态。
 * 
 * 感觉行为类的模式不假设一些具体的东西，就很难理解
 * 假设环境是一个账号，根据充值金额的数量，有普通，砖石会员的区别
 */
class Test {
public static void main(String[] args) {
	Context c=new Context();
	c.say();
	c.setPrice(5);
	c.say();
	c.setPrice(11);
	c.say();
	c.setPrice(12);
	c.say();
}
}
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
class StateB extends State{

	public StateB(Context s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	void say() {
		// TODO Auto-generated method stub
		
		System.out.println("我是黄金会员，我充了："+price);
	}


	
}
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

