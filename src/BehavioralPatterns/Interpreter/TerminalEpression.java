package BehavioralPatterns.Interpreter;

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
