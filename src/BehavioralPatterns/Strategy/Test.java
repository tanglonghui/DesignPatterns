package BehavioralPatterns.Strategy;
/*
 * 在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。
 * 这种类型的设计模式属于行为型模式。
 * 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。
 * 策略对象改变 context 对象的执行算法。
 * 类似布局管理器就是使用的策略模式。
 */
/*
 * 包含角色:
 * Context（环境类） 
 * Strategy（抽象策略类）//算法
 * ConcreteStrategy（具体策略类）//具体的算法
 * 假设有加减乘除的几种算法
 */
public class Test {
	public static void main(String[] args) {
		Context c=new Context(new ConcreteStrategyA());
		Context c1=new Context(new ConcreteStrategyB());
		System.out.println("加法"+c.executIt(5,5)); 
		System.out.println("减法"+c1.executIt(5,5)); 
		
	}
}
class Context{
	private Strategy strategy;
	public Context(Strategy strategy) {
		// TODO Auto-generated constructor stub
		this.strategy=strategy;
	}
	public int executIt(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}
interface Strategy{
	 public int doOperation(int num1, int num2);
}
class ConcreteStrategyA implements Strategy{

	@Override
	public int doOperation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}
	
}
class ConcreteStrategyB implements Strategy{

	@Override
	public int doOperation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}
	
}



