package BehavioralPatterns.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

//对象结构
class ButBasket{
	private ArrayList<Product> list=new ArrayList<>();

	public void accept(Visitor visitor) {
		Iterator<Product> i=list.iterator();
		while (i.hasNext()) {
			i.next().accept(visitor);

		}
	}
	public void addProduct(Product product) {
		list.add(product);
	}

	public void removeProduct(Product product) {
		list.remove(product);
	}
}
