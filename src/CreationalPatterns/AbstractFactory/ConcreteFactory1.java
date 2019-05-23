package CreationalPatterns.AbstractFactory;

class ConcreteFactory1 implements AbstractFactory{
	//1 品牌产品的专属工厂
	@Override
	public AbstractProductA produceA() {
		// TODO Auto-generated method stub
		System.out.print("1品牌工厂正在生产A类产品:");
		return new ConcreteProductA1();
	}

	@Override
	public AbstractProductB produceB() {
		// TODO Auto-generated method stub
		System.out.print("1品牌工厂正在生产B类产品:");
		return new ConcreteProductB1();
	}

}
