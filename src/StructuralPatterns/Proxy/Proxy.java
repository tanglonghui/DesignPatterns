package StructuralPatterns.Proxy;

class Proxy implements Subject{
	private RealSubject r=new RealSubject();

	@Override
	public void move() {
		// TODO Auto-generated method stub
		r.move();
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		r.jump();
	}

}
