package CreationalPatterns.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 原型模式（Prototype Pattern）是用于创建重复的对象，
 * 同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。
当直接创建对象的代价比较大时，则采用这种模式。
例如，一个对象需要在一个高代价的数据库操作之后被创建。
我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用。
 */
/*原型模式有两种
 * 关键接口 Cloneable 标识当前类 支持类的复制
 * 深克隆接口 serialization
 * 一个支持序列化的接口，具体使用请百度。
 * 1.浅克隆
 * 	ps：不复制其成员对象，也就是说其成员变量都持有相同对象的引用
 * 2.深克隆
 *  ps：连成员对象一起复制，值相同，但其成员对象持有引用不同
 *  
 */
/*
 * 包含角色:
 * 1.Prototype（抽象原型类）
 * 2.ConcretePrototype（具体原型类）
 */

class Test {
public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
	Prototype p1=new Prototype();
	p1.msg="hahaaaaaaaaaaaaaaaaaaaaaaaa";
	//clone的值传递
	Prototype p2=(Prototype) p1.clone();
	//普通的引用传递
	Prototype p3=p1;
	//深克隆
	Prototype p4=(Prototype) p1.deepClone();
	/*
	 * 可以看到浅克隆下
	 * 其成员对象没有进行复制，
	 * 只是传递了引用，p1,p2,p2,指向的都是同一个msg对象
	 * 另外 还可以手动深克隆，其在克隆对象的成员对象的类中也实现clone方法；
	 * 在本例中的话便是是msg实现克隆方法
	 */
	System.out.println("*************************************");
	System.out.println("浅克隆");
	System.out.println("p1和p2的引用相同么？"+(p1==p2));
	System.out.println("p1和p3的引用相同么？"+(p1==p3));
	System.out.println("p1和p2 msg的引用相同么？"+(p1.msg==p2.msg));
	System.out.println("p1和p3 msg的引用相同么？"+(p1.msg==p3.msg));
	System.out.println("*************************************");
	System.out.println("*************************************");
	System.out.println("深克隆");
	System.out.println("深：p1和p4的引用相同么？"+(p1==p4));
	System.out.println("浅：p1和p2的引用相同么？"+(p1==p2));
	System.out.println("深：p1和p4 msg的引用相同么？"+(p1.msg==p4.msg));
	System.out.println("浅：p1和p2 msg的引用相同么？"+(p1.msg==p2.msg));
	System.out.println("*************************************");
	
}
}


