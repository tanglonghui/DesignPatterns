package BehavioralPatterns.Mediator;

import java.util.Hashtable;

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
