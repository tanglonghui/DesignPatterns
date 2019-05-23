package BehavioralPatterns.Mediator;

//抽象聊天室类
abstract class AbstractChatroom{
	abstract void register(Member member);
	abstract void sendText(String from,String to,String message);
	abstract void sendImage(String from,String to,String image);
}
