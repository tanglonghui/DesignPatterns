package StructuralPatterns.Composite;

import java.util.ArrayList;

class Conposite implements Component{
	private ArrayList<Component> list=new ArrayList<>();

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		list.add(component);
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		list.remove(component);
	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return list.get(i);
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		for(Object object:list) {
			((Component)object).operation();
		}
	}

}
