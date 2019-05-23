package BehavioralPatterns.Memento;

//原发器
class Originator{
	private String state;
	Originator(){}
	//创建一个备忘录对象
	public Memento creatMemento() {
		return new Memento(this);
	}
	//根据备忘录对象恢复原发器状态
	public void restoreMemento(Memento m) {
		state=m.getState();
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getState() {
		return state;
	}
}
