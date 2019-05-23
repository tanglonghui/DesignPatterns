package BehavioralPatterns.Mediator;

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
