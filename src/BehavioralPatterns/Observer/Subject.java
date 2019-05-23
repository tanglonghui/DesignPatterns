package BehavioralPatterns.Observer;

import java.util.ArrayList;

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
