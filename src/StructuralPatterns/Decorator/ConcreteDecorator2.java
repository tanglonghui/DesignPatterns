package StructuralPatterns.Decorator;

class ConcreteDecorator2 extends Decorator{

	public ConcreteDecorator2(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	void functionC() {
		System.out.println("我是新增功能C");
	}
}
