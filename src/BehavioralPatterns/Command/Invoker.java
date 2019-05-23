package BehavioralPatterns.Command;

class Invoker{
	//声明一个Command类型的变量
	private Command command;
	//传入对象的构造器及方法
	public Invoker(Command command) {
		// TODO Auto-generated constructor stub
		this.command=command;
	}
	public void setCommand(Command command) {
		this.command = command;
	}
	//业务方法,用于调用命令的方法
	void call() {
		command.execute();
	}
}
