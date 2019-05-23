package CreationalPatterns.Builder;

class ConcreteBuilder implements Builder{

	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.setPartA("这是500万的地基");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.setPartB("这是500万的楼体");
	}

	@Override
	public void buildPartC() {
		// TODO Auto-generated method stub
		product.setPartC("这是500万的楼顶");
	}

	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
