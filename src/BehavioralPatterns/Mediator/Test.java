package BehavioralPatterns.Mediator;

import java.util.Hashtable;

/*
 *中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。
 *这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。
 *中介者模式属于行为型模式。 
 */
/*
 * 包含角色：
 * Mediator（抽象中介者）
 * ConcreteMediator（具体中介者）
 * Colleague（抽象同事类）
 * ConcreteColleague（具体同事类）
 */
public class Test {
public static void main(String[] args) {
	AbstractChatroom chatroom=new ChatGroup();
	Member m1,m2,m3,m4,m5;
	m1=new DiamondMember("1");
	m2=new DiamondMember("2");
	m3=new DiamondMember("3");
	m4=new CommonMember("4");
	m5=new CommonMember("5");
	chatroom.register(m1);
	chatroom.register(m2);
	chatroom.register(m3);
	chatroom.register(m4);
	chatroom.register(m5);
	m1.sendText("3", "你好");
	m1.sendText("3", "你好日");
	m1.sendImage("2", "1221222");
	m1.sendImage("2", "1224");
	m5.sendImage("1", "12");
	m5.sendText("3", "ni日");
	
}
}
