package StructuralPatterns.Bridge;

class A implements Shape{
	private Color color;
	private String shape="A";
	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return shape;
	}

	@Override
	public void draw(Color color) {
		// TODO Auto-generated method stub
		this.color=color;
		color.paint(this);
	}

}
