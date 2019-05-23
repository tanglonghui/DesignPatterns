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



