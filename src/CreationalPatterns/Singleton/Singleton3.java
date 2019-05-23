package CreationalPatterns.Singleton;

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
