package CreationalPatterns.SimpleFactory;
/*
 * 简单工厂模式是属于创建型模式，又叫做静态工厂方法（Static Factory Method）模式，
 * 但不属于23种GOF设计模式之一。简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。
 * 简单工厂模式是工厂模式家族中最简单实用的模式，可以理解为是不同工厂模式的一个特殊实现。
 */

/*
 * 包含角色：
 * 1.Factory（工厂角色)
 * 2.Product（抽象产品角色)
 * 3.ConcreteProduct（具体产品角色）
 */

class Test {
	public static void main(String[] args) {
		//建立工厂
		Factory factory=new Factory();
		//生产A
		factory.produce("A").say();
		//生产B
		factory.produce("B").say();
		/*
		 * ps:Product类中可用 interface 关键词修饰，效果相同
		 */
		
	}
}
class Factory{
	Product produce(String chose) {
		if(chose.equals("A")) {
			return new ConcreteProductA();
		}else if(chose.equals("B")) {
			return new ConcreteProductB();
		}else {
			System.out.println("输入的参数不对，没有该类");
			return null;
		}
		
	}
}
abstract class Product{
	abstract void say();
}
class ConcreteProductA extends Product{

	@Override
	void say() {
		// TODO Auto-generated method stub
		System.out.println("我是产品A！！！");
	}
	
}
class ConcreteProductB extends Product{

	@Override
	void say() {
		// TODO Auto-generated method stub
		System.out.println("我是产品B！！！");
	}
	
}
