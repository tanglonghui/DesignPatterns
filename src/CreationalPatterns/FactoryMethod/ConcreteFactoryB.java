package CreationalPatterns.FactoryMethod;

class ConcreteFactoryB implements Factory{

	@Override
	public Product produce() {
		// TODO Auto-generated method stub
		System.out.print("工厂B正在生产：");
		//这里向上转型了
		return new ProductB();
	}

}
