package BehavioralPatterns.Interpreter;

import java.util.Stack;

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
