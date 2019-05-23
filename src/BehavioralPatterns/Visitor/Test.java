package BehavioralPatterns.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 访问者模式（Visitor Pattern）是GoF提出的23种设计模式中的一种，属于行为模式。
 * 据《大话设计模式》中说算是最复杂也是最难以理解的一种模式了。
 * 定义（源于GoF《Design Pattern》）：表示一个作用于某对象结构中的各元素的操作。
 * 它使你可以在不改变各元素类的前提下定义作用于这些元素的新操作。
 * 从定义可以看出结构对象是使用访问者模式必备条件，
 * 而且这个结构对象必须存在遍历自身各个对象的方法。这便类似于Java语言当中的collection概念了。
 */
/*
 * 包含对象：
 * Vistor（抽象访问模式）
 * ConcreteVistor（具体访问者）
 * Element（抽象元素）
 * ConcreteElement（具体元素）
 * ObjectStructure（对象结构）
 * Emmm
 * 听说是 最复杂，最难以理解的模式。
 * 不怎么理解，直接先用书上的例子理一下思路吧
 * 访问者模式实例之购物车
 */
public class Test {
	public static void main(String[] args) {
		Product p1=new Apple();
		Product p2=new Apple();
		Product p3=new Book();
		Product p4=new Book();
		Visitor visitor;
		
		ButBasket basket=new ButBasket();
		basket.addProduct(p1);
		basket.addProduct(p2);
		basket.addProduct(p3);
		basket.addProduct(p4);
		visitor=new Customer();
		visitor.setName("张三");
		basket.accept(visitor);
		visitor=new Saler();
		visitor.setName("张三");
		basket.accept(visitor);
	}
}

