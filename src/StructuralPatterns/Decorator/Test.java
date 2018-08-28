package StructuralPatterns.Decorator;
/*
 * 装饰模式指的是在不必改变原类文件和使用继承的情况下，
 * 动态地扩展一个对象的功能。
 * 它是通过创建一个包装对象，
 * 也就是装饰来包裹真实的对象。
 */
/*
 * 包含角色：
 * Component（抽象构件类）
 * ConcreteComponent（具体构件类）
 * Decorator（抽象装饰类）
 * ConcreteDecorator（具体装饰类）
 * 简单说：就是具体装饰类接收一个具体构件为其增加功能。
 */
public class Test {
public static void main(String[] args) {
	ConcreteComponent cc=new ConcreteComponent();
	ConcreteDecorator1 decorator=new ConcreteDecorator1(cc);
	decorator.functionA();
	decorator.functionB();
	ConcreteDecorator2 c2=new ConcreteDecorator2(decorator);
	c2.functionC();
}
}
interface Component{
	void functionA();
}
class ConcreteComponent implements Component{

	@Override
	public void functionA() {
		// TODO Auto-generated method stub
		System.out.println("我是基础功能A");
	}
	
}
abstract class Decorator implements Component{
	private Component component;
	public Decorator(Component component) {
		// TODO Auto-generated constructor stub
		this.component=component;
	}
	@Override
	public void functionA() {
		// TODO Auto-generated method stub
		component.functionA();
	}
	
}
class ConcreteDecorator1 extends Decorator{

	public ConcreteDecorator1(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	void functionB() {
		System.out.println("我是新增功能B");
	}
}
class ConcreteDecorator2 extends Decorator{

	public ConcreteDecorator2(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	void functionC() {
		System.out.println("我是新增功能C");
	}
}
