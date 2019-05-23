package BehavioralPatterns.Memento;

//负责人
class CareTaker{
	private Memento memento;
	public Memento getMemento() {
		return memento;
	}
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
