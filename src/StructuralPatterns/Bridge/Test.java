package StructuralPatterns.Bridge;
/*
 * 桥接模式是将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 * 它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(Interface)模式。
 */
/*
 * 包含角色：
 * Abstraction（抽象类） 抽象   Color
 * RefinedAbstraction（扩充抽象类） 实例   Red Yellow Green
 * Implementor（实现类接口）  抽象    Shape
 * ConcreteImplementor（具体实现类 ） 实例  A B C
 * 
 * 我们用形状和颜色来做个例子 形状我就假设ABC了
 */
public class Test {
	public static void main(String[] args) {
		Shape shape;
		shape=new A();
		shape.draw(new Red());
		shape.draw(new Green());
	}

}
interface Color{
	<T extends Shape> void paint(T t);
}
class Red implements Color{
   private String msg="red";

@Override
	public <T extends Shape> void paint(T t) {
		// TODO Auto-generated method stub
			System.out.println("形状："+t.getShape()+"  颜色："+msg);
	}
}
class Green implements Color{
	   private String msg="green";

	@Override
		public <T extends Shape> void paint(T t) {
			// TODO Auto-generated method stub
				System.out.println("形状："+t.getShape()+"  颜色："+msg);
		}
	}


interface  Shape{
	String getShape();
	void draw(Color color);
	
}
class A implements Shape{
	private Color color;
	private String shape="A";
	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return shape;
	}

	@Override
	public void draw(Color color) {
		// TODO Auto-generated method stub
		this.color=color;
		color.paint(this);
	}
	
}
class B implements Shape{
	private Color color;
	private String shape="A";
	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return shape;
	}

	@Override
	public void draw(Color color) {
		// TODO Auto-generated method stub
		this.color=color;
		color.paint(this);
	}
	
}



