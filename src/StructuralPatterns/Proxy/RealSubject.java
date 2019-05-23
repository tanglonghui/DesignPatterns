package StructuralPatterns.Proxy;

class RealSubject implements Subject{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("移动");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("跳");
	}
}
