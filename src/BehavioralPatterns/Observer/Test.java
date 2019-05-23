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
 
