package CreationalPatterns.FactoryMethod;

class ConcreteFactoryA implements Factory{

	@Override
	public Product produce() {
		// TODO Auto-generated method stub
		System.out.print("工厂A正在生产：");
		//这里向上转型了
		return new ProductA();
	}

}
