package StructuralPatterns.Adapter;

abstract class Target{
	 String msg;
	 void show() {
		 System.out.println("我展示的是："+msg);

	}
}
