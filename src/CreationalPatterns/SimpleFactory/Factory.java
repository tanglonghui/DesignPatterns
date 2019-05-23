package CreationalPatterns.SimpleFactory;

class Factory{
	Product produce(String chose) {
		if(chose.equals("A")) {
			return new ConcreteProductA();
		}else if(chose.equals("B")) {
			return new ConcreteProductB();
		}else {
			System.out.println("输入的参数不对，没有该类");
			return null;
		}

	}
}
