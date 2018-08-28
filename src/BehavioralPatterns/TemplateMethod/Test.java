package BehavioralPatterns.TemplateMethod;
/*
 * 在模板模式（Template Pattern）中，
 * 一个抽象类公开定义了执行它的方法的方式/模板。
 * 它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。
 */
/*
 * 包含角色:
 * AbstractClass(抽象类)
 * ConcreteClass(具体子类)
 * 模拟业务流程什么的，我觉得来一套军体拳很好
 */
public class Test {
public static void main(String[] args) {
	ConcreteClass c=new  ConcreteClass();
	c.start();
}
}
abstract class AbstractClass{
	abstract void leftHook();
	abstract void rightHook();
	abstract void end();
	public final void start(){
		 leftHook();
		 rightHook();
		 end();
	   }
}
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