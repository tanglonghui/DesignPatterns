package BehavioralPatterns.Mediator;

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
