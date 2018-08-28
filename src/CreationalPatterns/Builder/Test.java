package CreationalPatterns.Builder;
/*
 * 建造者模式是设计模式的一种，将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * 什么是复杂对象：
 * 就像一栋大楼，这是一个很复杂的东西，有地基，楼体，楼顶等。它可以有不同样式。
/*
 * 包含角色：
 * 1.Builder（抽象建造者）
 * 2.ConcreteBuider(具体建造者)
 * 3.Product(产品角色)
 * 4.Director(指挥者)
 */
public class Test {
	public static void main(String[] args) {
		Builder builder=new ConcreteBuilder();
		Director director=new Director(builder);
		Product product=director.construct();
		System.out.println(product.getPartA());
		System.out.println(product.getPartB());
		System.out.println(product.getPartC());
		//我们可以建造不同价格的大楼,通过匿名内部类在这里自定义
		Director director2=new Director(new Builder() {
			
			@Override
			public Product getResult() {
				// TODO Auto-generated method stub
				return product;
			}
			
			@Override
			public void buildPartC() {
				// TODO Auto-generated method stub
				product.setPartC("100万");
			}
			
			@Override
			public void buildPartB() {
				// TODO Auto-generated method stub
				product.setPartB("100万");
			}
			
			@Override
			public void buildPartA() {
				// TODO Auto-generated method stub
				product.setPartA("100万");
			}
		});
			Product product2= director2.construct();
		  	System.out.println("下面是一百万的房子");
		  	System.out.println(product2.getPartA());
			System.out.println(product2.getPartB());
			System.out.println(product2.getPartC());
			
	}
	
}

class Product{
	/*
	 * ABC三个部分可以是任意类型
	 * 我们在这里假设A是地基 B是楼体 C是楼顶 建造顺序必须按照ABC的顺序来
	 */
	private String partA;
	private String partB;
	private String partC;
	//一个具体的产品类模型应该做好封装包含get set 方法
	public String getPartA() {
		return partA;
	}
	public String getPartB() {
		return partB;
	}
	public String getPartC() {
		return partC;
	}
	public void setPartA(String partA) {
		this.partA = partA;
	}
	public void setPartB(String partB) {
		this.partB = partB;
	}
	public void setPartC(String partC) {
		this.partC = partC;
	}
}
interface Builder{
	Product product=new Product();
	void buildPartA();
	void buildPartB();
	void buildPartC();
	//获得结果的方法
	Product getResult();
}
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
