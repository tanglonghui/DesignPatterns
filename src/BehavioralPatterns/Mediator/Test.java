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
//抽象聊天室类
abstract class AbstractChatroom{
	abstract void register(Member member);
	abstract void sendText(String from,String to,String message);
	abstract void sendImage(String from,String to,String image);
}
//抽象会员类
 abstract class Member{
	protected AbstractChatroom chatroom;
	protected String name;
	public Member(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setChatroom(AbstractChatroom chatroom) {
		this.chatroom = chatroom;
	}
	public AbstractChatroom getChatroom() {
		return chatroom;
	}
	abstract void sendText(String to,String message);
	abstract void sendImage(String to,String image);
	
	 void receiveText(String from,String message) {
		 System.out.println(from+" 发文本给送"+this.name+",内容为："+message);
	 }
	void receiveImage(String from,String image) {
		 System.out.println(from+" 发图片给送"+this.name+",内容为："+image);
	}
}
 //具体聊天室类
class ChatGroup extends AbstractChatroom{
		private Hashtable<String, Member> members=new Hashtable<>();
	@Override
	void register(Member member) {
		// TODO Auto-generated method stub
		if(!members.contains(member)) {
			members.put(member.getName(),member);
			member.setChatroom(this);
		}
	}

	@Override
	void sendText(String from, String to, String message) {
		// TODO Auto-generated method stub
		Member member=members.get(to);
		String newMessage=message;
		//模拟不雅字符
		newMessage=message.replaceAll("日", "*");
		member.receiveText(from, newMessage);
	}

	@Override
	void sendImage(String from, String to, String image) {
		// TODO Auto-generated method stub
		Member member=members.get(to);
		
		//模拟图片大小判断
		if(image.length()>5) {
			System.out.println("图片太大发送失败");
		}else {
			member.receiveImage(from, image);
		}
		
	}
	
}
//具体普通会员
class CommonMember extends Member{
	public CommonMember(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	void sendImage(String to, String image) {
		// TODO Auto-generated method stub
		System.out.println("不能发送图片");
	}
	@Override
	void sendText(String to, String message) {
		// TODO Auto-generated method stub
		System.out.println("普通会员发送文本");
		chatroom.sendText(name, to, message);
	}
}
//具体砖石会员
class DiamondMember extends Member{
	public DiamondMember(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	void sendImage(String to, String image) {
		// TODO Auto-generated method stub
		System.out.println("砖石会员发送图片");
		chatroom.sendImage(name, to, image);
	}
	@Override
	void sendText(String to, String message) {
		// TODO Auto-generated method stub
		System.out.println("砖石会员发送文本");
		chatroom.sendText(name, to, message);
	}
}