package BehavioralPatterns.Command;

class ConcreteCommand implements Command{
	//声明一个接受者的变量
	Receiver receiver;
	//传入接收者的构造器及方法
	public ConcreteCommand(Receiver receiver) {
		// TODO Auto-generated constructor stub
		this.receiver=receiver;
	}
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	//具体的执行,这里其实可以定义一套组合键功能
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}
