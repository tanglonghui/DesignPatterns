package BehavioralPatterns.Observer;

class ConcreteSubject extends Subject{

   @Override
   public void cry() {
       // TODO Auto-generated method stub
       System.out.println("发起事件源");
       for(Object obs:observers) {
           ((Observer)obs).response();
       }
   }

}
