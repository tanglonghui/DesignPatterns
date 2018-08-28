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
 //饿汉式 eagerly load(急切地加载)
 class Singleton1{
	 public static Singleton1 singleton1=new Singleton1();
	 private Singleton1() {}
	 public static Singleton1 getSingleton1() {
		return singleton1;
	 }
 }
 //懒汉式 lazy load （延迟加载）
 class Singleton2{
	 public static Singleton2 singleton2;
	 private Singleton2(){}
	 public static Singleton2 getSingleton2() {
		 //线程不安全
		 if(singleton2!=null) {
			 return singleton2;
		 }else {
			 singleton2=new Singleton2();
			 return singleton2;	 
		 }
			
		 }
 }
 class Singleton3{
	 //双重判断实现了线程安全
	 private static volatile Singleton3 singleton3;

	    private Singleton3() {}
	    
		public static Singleton3 getSingleton3() {
	        if (singleton3 == null) {
	            synchronized (Singleton3.class) {
	                if (singleton3 == null) {
	                    singleton3 = new Singleton3();
	                }
	            }
	        }
	        return singleton3;
	    }
	 
 }
