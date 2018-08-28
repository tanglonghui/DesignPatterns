package BehavioralPatterns.Observer;

import java.util.ArrayList;

/*
 * 观察者模式（有时又被称为模型-视图（View）模式、源-收听者(Listener)模式或从属者模式）
 * 是软件设计模式的一种。在此种模式中，
 * 一个目标物件管理所有相依于它的观察者物件，
 * 并且在它本身的状态改变时主动发出通知。
 * 这通常透过呼叫各观察者所提供的方法来实现。
 * 此种模式通常被用来实现事件处理系统。
 */
/*
 * 包含角色
 * Subject（目标）
 * ConcreteSubject（具体目标）
 * Observer（观察者）
 * ConcreteObserver（具体观察者）
 * Emmmm
 * 貌似很简单的样子,没有想象中的那么复杂
 */
public class Test {
public static void main(String[] args) {
	ConcreteObserverA ca=new ConcreteObserverA();
	ConcreteObserverB cb=new ConcreteObserverB();
	ConcreteSubject s=new ConcreteSubject();
	s.attach(ca);
	s.attach(cb);
	s.cry();
	}
}
//抽象目标
 abstract class Subject{
	protected ArrayList<Observer> observers=new ArrayList<>();
	//注册方法
	public void attach(Observer observer) {
		observers.add(observer);
	}
	//注销方法
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	public abstract void cry();
}
//抽象观察者类
 interface Observer{
	 void response();
 }
 
 class ConcreteSubject extends Subject{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("发起事件源");
		for(Object obs:observers) {
			((Observer)obs).response();
		}
	}
	 
 }
 class ConcreteObserverA implements Observer{

	@Override
	public void response() {
		// TODO Auto-generated method stub
		System.out.println("事件响应A");
	}
	 
 }
 class ConcreteObserverB implements Observer{

		@Override
		public void response() {
			// TODO Auto-generated method stub
			System.out.println("事件响应B");
		}
		 
	 }