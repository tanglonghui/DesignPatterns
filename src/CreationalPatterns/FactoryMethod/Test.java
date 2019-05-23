package CreationalPatterns.FactoryMethod;
/*
 * 工厂方法模式(FACTORY METHOD)是一种常用的对象创建型设计模式,
 * 此模式的核心精神是封装类中不变的部分，
 * 提取其中个性化善变的部分为独立类，通过依赖注入以达到解耦、复用和方便后期维护拓展的目的。
 */
/*
 * 包含角色：
 * 1.Product（抽象产品）
 * 2.ConCreteProduct(具体产品)
 * 3.Factory(抽象工厂)
 * 4.ConcreteFactory(具体工厂)
 */
class Test {
	public static void main(String[] args) {
		new ConcreteFactoryA().produce().say();
		new ConcreteFactoryB().produce().say();
		/*工厂生产中将ProductA 向上转型成了Product
		 * 所以要使具体产品变量获得引用，需要向下转型。
		 */
		Product p=new ConcreteFactoryA().produce();
		ProductA p1=(ProductA) new ConcreteFactoryA().produce();
		p.say();
		p1.say();
	}

}
