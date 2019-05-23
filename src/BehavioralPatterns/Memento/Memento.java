package BehavioralPatterns.Memento;

//备忘录
class Memento{
	private String state;
	public Memento(Originator originator) {
		// TODO Auto-generated constructor stub
		this.state=originator.getState();
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getState() {
		return state;
	}
}
