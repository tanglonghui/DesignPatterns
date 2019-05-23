package BehavioralPatterns.Visitor;

//具体访问者
class Saler extends Visitor{

	@Override
	public void visit(Apple apple) {
		// TODO Auto-generated method stub
		System.out.println("收银员"+name+"给苹果过秤，然后计算其价格。");
	}

	@Override
	public void visit(Book book) {
		// TODO Auto-generated method stub
		System.out.println("收银员"+name+"直接计算书的价格");
	}

}
