package BehavioralPatterns.Visitor;

//具体访问者
class Customer extends Visitor{

	@Override
	public void visit(Apple apple) {
		// TODO Auto-generated method stub
		System.out.println("顾客"+name+"选苹果");
	}

	@Override
	public void visit(Book book) {
		// TODO Auto-generated method stub
		System.out.println("顾客"+name+"买书");
	}

}
