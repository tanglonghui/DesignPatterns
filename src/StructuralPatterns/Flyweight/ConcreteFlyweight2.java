package StructuralPatterns.Flyweight;

class ConcreteFlyweight2 implements Flyweight{
	private String type;//内部状态标识码
	public ConcreteFlyweight2(String type) {
		// TODO Auto-generated constructor stub
		this.type=type;
	}
	void fly() {
		System.out.println("专属飞翔");
	}

	@Override
	public void Say(Port port) {
		// TODO Auto-generated method stub
		System.out.println("网络连接,路由器type："+this.type+"  端口port："+port.getPort());
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("通用移动");
	}

}
