package BehavioralPatterns.Iterator;
/*
 * 迭代器模式（Iterator），提供一种方法顺序访问一个聚合对象中的各种元素，而又不暴露该对象的内部表示。
 * 
 * 基本常见得集合类都设有自己的迭代器。
 */
/*
 * 包含角色：
 * Iterator(抽象迭代器)
 *   一般声明如下方法：
 *   1.first（）获取第一个元素。
 *   2.next（） 访问下一个元素。
 *   3.hasNext（）判断是否还有下一个元素
 *   4.currentItem（） 获取当前元素
 * ConcreteIterator（具体迭代器）
 * Aggregate（抽象聚合类）
 * ConcreteAggregate（具体聚合类）
 */
public class Test {
	public static void main(String[] args) {
		Iterator iterator=new ConcreteAggregate().createIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.currentItem().toString());
			iterator.next();
		}
	}
}

