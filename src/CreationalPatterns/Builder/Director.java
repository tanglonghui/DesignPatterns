package CreationalPatterns.Builder;

class Director{
	private Builder builder;
	Director(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder=builder;
	}
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	Product construct() {
		//这里指定构造顺序
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
		return builder.getResult();

	}
}
