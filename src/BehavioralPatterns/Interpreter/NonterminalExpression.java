package BehavioralPatterns.Interpreter;

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
