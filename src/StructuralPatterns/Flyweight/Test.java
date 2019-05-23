package StructuralPatterns.Flyweight;


import java.util.HashMap;

/*
 * 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，
 * 以减少内存占用和提高性能。这种类型的设计模式属于结构型模式，
 * 它提供了减少对象数量从而改善应用所需的对象结构的方式。
 */
/*
 * 包含模式：
 * Flyweight（抽象享元类）
 * ConcreteFlyweight（具体享元类）  单例设计
 * UnsharedConcreteFlyWeight（非共享具体享元类） 非单例设计
 * FlyweightFactory（享元工厂类）ps：可以定义ArrayList等 它是一个享员池
 * ps：这东西这么看上去这么像是设计数据库连接池的东东。
 *   简单说：享元工厂类中有一个享元池，外部对象可以通过他获得具体享员类的对象 若享元池有，直接给，若没有，
 *   新建一个给它并把这个对象加入享元池。
 *   内部状态，可以相同无所谓
 * 外部状态，例如分配的端口号不一样需要提取出来
 */
public class Test {
	public static void main(String[] args) {
		FlyweightFactory factory=new FlyweightFactory();
		System.out.println("路由器最大序列号："+factory.getLyCount()); 
		System.out.println("交换机最大序列号："+factory.getJhjCount());
		Flyweight flyweight=factory.getDevice("路由器", 0);
		Flyweight flyweight1=factory.getDevice("路由器", 2);
		Flyweight flyweight2=factory.getDevice("路由器", 10);
		Flyweight flyweight3=factory.getDevice("交换机", 0);
		Port p=new Port();
		p.setPort("1");
		flyweight.Say(p);
		p.setPort("2");
		flyweight1.Say(p);
		System.out.println("路由器最大序列号："+factory.getLyCount()); 
		System.out.println("交换机最大序列号："+factory.getJhjCount());
	}
}



