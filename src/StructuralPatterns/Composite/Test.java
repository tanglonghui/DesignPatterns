package StructuralPatterns.Composite;

import java.util.ArrayList;

/*
 * 组合模式，将对象组合成树形结构以表示“部分-整体”的层次结构，
 * 组合模式使得用户对单个对象和组合对象的使用具有一致性。
 * 掌握组合模式的重点是要理解清楚 “部分/整体” 还有 ”单个对象“ 与 "组合对象" 的含义。
 */
/*
 * 包含角色：
 * Component（抽象构件）
 * Leaf（叶子构件）
 * Composite（容器构件）
 */
public class Test {
	public static void main(String[] args) {
		Conposite c1=new Conposite();
		Conposite c2=new Conposite();
		Conposite c3=new Conposite();
		Conposite c4=new Conposite();
		Leaf1 l1=new Leaf1();
		Leaf2 l2=new Leaf2();
		Leaf1 l3=new Leaf1();
		Leaf1 l4=new Leaf1();
		c1.add(c2);
		c1.add(c4);
		c1.add(l3);
		c2.add(c3);
		c3.add(l1);
		c3.add(l2);
		c4.add(l4);
		//c1.operation();
		c4.operation();
		
		
	}
}
interface Component{
	void add(Component component);
	void remove(Component component);
	Component getChild(int i);
	void operation();
}
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
class Leaf1 implements Component{
// 因叶子构件不再包含子构件 ，所以前三个方法应该包含错误提示；
	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		System.out.println("叶子构件无法添加子构件");
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		System.out.println("叶子构件无子构件");
	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("叶子构件无子构件");
		return null;
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("子构件1");
	}
	
}
class Leaf2 implements Component{
	// 因叶子构件不再包含子构件 ，所以前三个方法应该包含错误提示；
		@Override
		public void add(Component component) {
			// TODO Auto-generated method stub
			System.out.println("叶子构件无法添加子构件");
		}

		@Override
		public void remove(Component component) {
			// TODO Auto-generated method stub
			System.out.println("叶子构件无子构件");
		}

		@Override
		public Component getChild(int i) {
			// TODO Auto-generated method stub
			System.out.println("叶子构件无子构件");
			return null;
		}

		@Override
		public void operation() {
			// TODO Auto-generated method stub
			System.out.println("子构件2");
		}
		
	}
