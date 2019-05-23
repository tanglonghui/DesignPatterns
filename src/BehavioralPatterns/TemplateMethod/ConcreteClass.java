package BehavioralPatterns.TemplateMethod;

class ConcreteClass extends AbstractClass{

	@Override
	void leftHook() {
		// TODO Auto-generated method stub
		System.out.println("左勾拳");
	}

	@Override
	void rightHook() {
		// TODO Auto-generated method stub
		System.out.println("右勾拳");
	}

	@Override
	void end() {
		// TODO Auto-generated method stub
		System.out.println("打完收工");
	}

}
