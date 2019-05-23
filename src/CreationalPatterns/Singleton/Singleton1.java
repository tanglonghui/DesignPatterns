package CreationalPatterns.Singleton;

//饿汉式 eagerly load(急切地加载)
class Singleton1{
    public static Singleton1 singleton1=new Singleton1();
    private Singleton1() {}
    public static Singleton1 getSingleton1() {
       return singleton1;
    }
}
