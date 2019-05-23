package StructuralPatterns.Facade;

class Facade{
	SubSystem1 s1=new SubSystem1();
	SubSystem2 s2=new SubSystem2();
	//在这里可以自定义组合功能键
	void control1(){
		s1.on();
		s2.move();
	}
	void control2() {
		s1.off();
		s2.say();
	}
}
