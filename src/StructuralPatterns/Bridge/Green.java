package StructuralPatterns.Bridge;

class Green implements Color{
	   private String msg="green";

	@Override
		public <T extends Shape> void paint(T t) {
			// TODO Auto-generated method stub
				System.out.println("形状："+t.getShape()+"  颜色："+msg);
		}
	}
