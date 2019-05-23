package BehavioralPatterns.TemplateMethod;

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
