package CreationalPatterns.AbstractFactory;

class ConcreteFactory2 implements AbstractFactory{
	//1 品牌产品的专属工厂
	@Override
	public AbstractProductA produceA() {
		// TODO Auto-generated method stub
		System.out.print("2品牌工厂正在生产A类产品:");
		return new ConcreteProductA2();
	}

	@Override
	public AbstractProductB produceB() {
		// TODO Auto-generated method stub
		System.out.print("2品牌工厂正在生产B类产品:");
		return new ConcreteProductB2();
	}

}
