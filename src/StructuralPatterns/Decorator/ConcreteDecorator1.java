package StructuralPatterns.Decorator;

class ConcreteDecorator1 extends Decorator{

	public ConcreteDecorator1(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	void functionB() {
		System.out.println("我是新增功能B");
	}
}
