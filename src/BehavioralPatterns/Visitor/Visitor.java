package BehavioralPatterns.Visitor;

//抽象访问者
abstract class Visitor{
	protected String name;
	public void setName(String name) {
		this.name = name;
	}
	public abstract void visit(Apple apple);
	public abstract void visit(Book book);
}
