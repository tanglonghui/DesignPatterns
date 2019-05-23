package CreationalPatterns.Singleton;
/*
 * 单例模式，是一种常用的软件设计模式。在它的核心结构中只包含一个被称为单例的特殊类。
 * 通过单例模式可以保证系统中，应用该模式的类一个类只有一个实例。即一个类只有一个对象实例
 */
/*
 * 包含角色
 * Singleton（单例类）需要实现单例类的类
 * 要点：
 * 1.私有构造函数
 * 2.提供一个自身的静态私有成员变量,并在类本身给其一个实例化的引用。
 * 3.提供一个静态的获得这个变量的方法
 */
 class Test {
	 public static void main(String[] args) {
	Singleton1 s1=Singleton1.getSingleton1();
	Singleton1 s2=Singleton1.getSingleton1();
	Singleton2 s3=Singleton2.getSingleton2();
	Singleton2 s4=Singleton2.getSingleton2();
	Singleton3 s5=Singleton3.getSingleton3();
	Singleton3 s6=Singleton3.getSingleton3();
	System.out.println("s1 s2 的引用相同么"+(s1==s2) );
	System.out.println("s3 s4 的引用相同么"+(s3==s4) );
	System.out.println("s5 s6 的引用相同么"+(s5==s6) );
	}
}
