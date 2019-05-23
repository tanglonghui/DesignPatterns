package StructuralPatterns.Adapter;

class Adapter extends  Target{
	Adaptee adaptee;
	public Adapter(Adaptee adaptee) {
		// TODO Auto-generated constructor stub
		this.adaptee=adaptee;
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		//适配器做操作将String类型数据变成 int 类型
		super.msg=String.valueOf(adaptee.msg);
		super.show();
	}

}
