package StructuralPatterns.Decorator;

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
