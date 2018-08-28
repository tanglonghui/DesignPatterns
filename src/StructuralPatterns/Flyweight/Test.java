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
interface Flyweight{
	void Say(Port port);
	void move();
}
class Port{
	//提取出来的外部状态 
	private  String port;
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
}
class ConcreteFlyweight1 implements Flyweight{
	private String type;//内部状态标识码
	public ConcreteFlyweight1(String type) {
		// TODO Auto-generated constructor stub
		this.type=type;
	}
	void jump() {
		System.out.println("专属跳跃");
	}

	@Override
	public void Say(Port port) {
		// TODO Auto-generated method stub
		System.out.println("网络连接,路由器type："+this.type+"  端口port："+port.getPort());
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("通用移动");
	}
	
}
class ConcreteFlyweight2 implements Flyweight{
	private String type;//内部状态标识码
	public ConcreteFlyweight2(String type) {
		// TODO Auto-generated constructor stub
		this.type=type;
	}
	void fly() {
		System.out.println("专属飞翔");
	}

	@Override
	public void Say(Port port) {
		// TODO Auto-generated method stub
		System.out.println("网络连接,路由器type："+this.type+"  端口port："+port.getPort());
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("通用移动");
	}
	
}
class FlyweightFactory{
	//private ArrayList<Flyweight> device=new ArrayList<>();
	/*
	 * 这里用map应该舒服一些
	 */
	private HashMap<String, Flyweight> device=new HashMap<>();
	//设置一个指针
	private int lyCount;
	private int jhjCount;
	private Flyweight flyweight;
	public int getLyCount() {
		return lyCount-1;
	}
	public int getJhjCount() {
		return jhjCount-1;
	}
	public FlyweightFactory() {
		// TODO Auto-generated constructor stub
		lyCount=0;
		jhjCount=0;
		ConcreteFlyweight1 c1=new ConcreteFlyweight1("路由器"+lyCount);
		device.put("路由器"+lyCount++, c1);
		ConcreteFlyweight2 c2=new ConcreteFlyweight2("交换机1"+jhjCount);
		device.put("交换机"+jhjCount++, c2);
	}
	public Flyweight getDevice(String type,int count) {
		if((flyweight=device.get(type+count))!=null) {
			System.out.println("已找到，为你返回");
			return flyweight;
		}else {
			switch (type) {
			case "路由器":
				
				flyweight=new ConcreteFlyweight1(type+lyCount);
				device.put("路由器"+lyCount++, flyweight);
				System.out.println("无你指定的设备已经为你新建，序列号为："+lyCount);
				return flyweight;
			
			case "交换机":
				flyweight=new ConcreteFlyweight2(type+jhjCount);
				device.put("交换机"+jhjCount++, flyweight);
				System.out.println("无你指定的设备已经为你新建，序列号为："+jhjCount);
				return flyweight;

			default:
				return null;
			}
		}
		
	
		
	}
}



