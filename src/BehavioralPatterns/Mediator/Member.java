package BehavioralPatterns.Mediator;

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
