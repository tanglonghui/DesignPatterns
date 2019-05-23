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
