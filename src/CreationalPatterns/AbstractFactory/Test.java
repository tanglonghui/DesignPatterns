package CreationalPatterns.AbstractFactory;
/*
 * 工厂方法模式的进化版
 * 抽象工厂模式：
 * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类
 * 抽象工厂模式是所有形态的工厂模式中最为抽象和最具一般性的一种形态。
 * 抽象工厂模式是指当有多个抽象角色时，使用的一种工厂模式。
 * 抽象工厂模式可以向客户端提供一个接口，使客户端在不必指定产品的具体的情况下，创建多个产品族中的产品对象。
 * 根据里氏替换原则，任何接受父类型的地方，都应当能够接受子类型。
 * 因此，实际上系统所需要的，仅仅是类型与这些抽象产品角色相同的一些实例，而不是这些抽象产品的实例。
 * 换言之，也就是这些抽象产品的具体子类的实例。工厂类负责创建抽象产品的具体子类的实例。
 */
/*
 * 包含角色:
 * AbstractFactory（抽象工厂)
 * ConcreteFactory（具体工厂）
 * AbstractProduct（抽象产品）
 * ConcreteProduct（具体产品）
 */
 class Test {
	public static void main(String[] args) {
		new ConcreteFactory1().produceA().whatAConDo();
		new ConcreteFactory2().produceA().whatAConDo();
	}
}
