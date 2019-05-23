package BehavioralPatterns.Interpreter;

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
