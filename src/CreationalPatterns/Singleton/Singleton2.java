package CreationalPatterns.Singleton;

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
