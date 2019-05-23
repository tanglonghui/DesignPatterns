package StructuralPatterns.Proxy;
/*
 * 在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。
 * 这种类型的设计模式属于结构型模式。
 * 在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。
 */
/*
 * 包含角色：
 * Subject（抽象主题角色）
 * Proxy（代理主题角色）
 * RealSubject（真实主题角色）
 * 简单说：
 * 通过 Proxy 可以在一定程度上的操作 RealSubject
 */
public class Test {
	public static void main(String[] args) {
		Proxy proxy=new Proxy();
		/*
		 * 正常情况下需要设置权限的限制Proxy的使用范围，这里省略了
		 */
		proxy.move();
		proxy.jump();
	}
}
