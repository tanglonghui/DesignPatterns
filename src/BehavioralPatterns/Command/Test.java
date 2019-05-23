package BehavioralPatterns.Command;
/*
 * 命令模式（Command Pattern）是一种数据驱动的设计模式，
 * 它属于行为型模式。请求以命令的形式包裹在对象中，并传给调用对象。
 * 调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 * 设计模式一书中的定义如下：
 * 将一个请求封装成为一个对象，从而使我们可用不同的请求对客户进行参数化；
 * 对请求排队或者记录请求日志，以及支持可撤销的操作。命令模式是一种对象
 * 行为型模式，其别名为动作模式或事务模式。
 */
/*
 * 包含对象：
 * Command（抽象命令类）
 * ConcreteCommand（具体命令类）
 * Invoker（调用者）
 * Receiver（接收者）
 * Client（客户类）
 */
public class Test {
public static void main(String[] args) {
	Receiver receiver=new Receiver();
	ConcreteCommand command=new ConcreteCommand(receiver);
	Invoker invoker=new Invoker(command);
	invoker.call();
}
}

