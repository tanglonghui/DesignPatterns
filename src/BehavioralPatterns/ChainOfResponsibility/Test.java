package BehavioralPatterns.ChainOfResponsibility;
/*
 * 责任链模式是一种设计模式。在责任链模式里，
 * 很多对象由每一个对象对其下家的引用而连接起来形成一条链。
 * 请求在这个链上传递，直到链上的某一个对象决定处理此请求。
 * 发出这个请求的客户端并不知道链上的哪一个对象最终处理这个请求，
 * 这使得系统可以在不影响客户端的情况下动态地重新组织和分配责任。
 */
/*
 * 包含角色：
 * 1.Hanglder(抽象处理者)
 * 2.ConcreteHandler（具体处理者）
 * 3.Client（客户类）
 * 简单说：说不出来
 *就用书上请假的小例子吧，我设 A B C 三个等级的管理者
 *Retrofit设置Gson等数据解析的时候是不是用了这个设计模式？有点像
 */
public class Test {
public static void main(String[] args) {
	//造个假条
	LeaveRequest l1=new LeaveRequest("1", 25);
	//造三个人
	ConcreteHandlerA a=new ConcreteHandlerA("A");
	ConcreteHandlerB b=new ConcreteHandlerB("B");
	ConcreteHandlerC c=new ConcreteHandlerC("C");
	//设置职责的大小，也就是处理顺序
	a.setHanglder(b);
	b.setHanglder(c);
	//发送请求
	a.handleRequest(l1);
}
}



