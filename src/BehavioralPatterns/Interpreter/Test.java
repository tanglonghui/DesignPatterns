package BehavioralPatterns.Interpreter;

import java.util.HashMap;
import java.util.Stack;

/*
 * 解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，
 * 它属于行为型模式。这种模式实现了一个表达式接口，该接口解释一个特定的上下文。
 * 这种模式被用在 SQL 解析、符号处理引擎等。
 */
/*
 * 包含对象：
 * AbstractExpression（抽象表达式）
 * TerminalExpression（终结符表达式）
 * NonterminalExpression（非终结符表达式）
 * Context（环境类）
 * Client（客户类）
 */
public class Test {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		String str="1 + 12 - 1";
		calculator.build(str);
		System.out.println(calculator.compute());
	}
}
/*
 * 
 */
class Context{
	/*
	 * 环境类，上下文
	 * 假设我们要把一句英文翻译为中文
	 * 例如 hello world  
	 * 翻译成  你好 世界
	 *(>.<)这里简单一点学教材做加减的解释器，省略环境类
	 */
	private HashMap<String, String> map=new HashMap<>();
	//往环境中设值
	public void assign(String key,String value) {
		map.put(key, value);
	}
	//获取环境中的值
	String lookup(String key){
		return map.get(key);
	}
	public void initData() {
		//
		map.put("hello", "你好");
		map.put("world", "世界");
	}
	
}
interface AbstractExpression{
	int interpret();
}
class TerminalEpression implements AbstractExpression{
  //对于终结符表达式的解释操作 这里表示值
	private int value;
	public TerminalEpression(int value) {
		// TODO Auto-generated constructor stub
		this.value=value;
	}
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return this.value;
	}
}
abstract class NonterminalExpression implements AbstractExpression{
//对于非终结符的操作 类的父类 
	protected AbstractExpression left;
	protected AbstractExpression right;
	public NonterminalExpression(AbstractExpression left,
			AbstractExpression right) {
		this.left=left;
		this.right=right;
	}
}
class Add extends NonterminalExpression{

	public Add(AbstractExpression left, AbstractExpression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return super.left.interpret()+super.right.interpret();
	}
	
}
class Sub extends NonterminalExpression{

	public Sub(AbstractExpression left, AbstractExpression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return super.left.interpret()-super.right.interpret();
	}
}
//解释器封装类Calculator（计算器类）

class Calculator{
	private String statement;
	private AbstractExpression abstractExpression;
	
	void build(String statement) {
		AbstractExpression left=null,right=null;
		/*
		 * 工具类中的栈 有 pop push isEmpty peek search 五个方法
		 */
		Stack<AbstractExpression> stack=new Stack<>();
		//split 使用给定的正则表达式拆分字符串
		//若是翻译的话便是拆分成了单词
		String[] statementArr=statement.split(" ");
		for(int i=0;i<statementArr.length;i++) {
			if(statementArr[i].equalsIgnoreCase("+")) {
				left=stack.pop();
				int val=Integer.parseInt(statementArr[++i]);
				right=new TerminalEpression(val);
				stack.push(new Add(left,right));
			}else if(statementArr[i].equalsIgnoreCase("-")) {
				left=stack.pop();
				int val=Integer.parseInt(statementArr[++i]);
				right=new TerminalEpression(val);
				stack.push(new Sub(left,right));
			}else {
				stack.push(new TerminalEpression
				(Integer.parseInt(statementArr[i])));
			}
		}
		this.abstractExpression=stack.pop();
	}
	int compute() {
		return abstractExpression.interpret();
		}
}