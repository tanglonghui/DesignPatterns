package StructuralPatterns.Composite;

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
