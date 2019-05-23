package CreationalPatterns.Builder;

interface Builder{
	Product product=new Product();
	void buildPartA();
	void buildPartB();
	void buildPartC();
	//获得结果的方法
	Product getResult();
}
