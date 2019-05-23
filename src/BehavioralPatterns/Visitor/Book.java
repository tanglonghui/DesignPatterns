package BehavioralPatterns.Visitor;

//具体产品
class Book implements Product{

	@Override
	public void accept(Visitor vistor) {
		// TODO Auto-generated method stub
		vistor.visit(this);
	}

}
