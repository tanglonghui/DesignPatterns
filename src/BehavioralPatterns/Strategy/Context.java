package BehavioralPatterns.Strategy;

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
