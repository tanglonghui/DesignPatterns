package BehavioralPatterns.State;
/*
 * 状态模式——允许一个对象在其内部状态改变时自动改变其行为，对象看起来就像是改变了它的类。
 */
/*
 * 包含角色：
 * Context（环境类）：状态持有者
 * State（抽象状态类）
 * ConcreteState（具体状态类）：从环境类中分离的状态。
 * 
 * 感觉行为类的模式不假设一些具体的东西，就很难理解
 * 假设环境是一个账号，根据充值金额的数量，有普通，砖石会员的区别
 */
class Test {
public static void main(String[] args) {
	Context c=new Context();
	c.say();
	c.setPrice(5);
	c.say();
	c.setPrice(11);
	c.say();
	c.setPrice(12);
	c.say();
}
}

