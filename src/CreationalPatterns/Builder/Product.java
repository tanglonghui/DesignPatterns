package CreationalPatterns.Builder;

class Product{
	/*
	 * ABC三个部分可以是任意类型
	 * 我们在这里假设A是地基 B是楼体 C是楼顶 建造顺序必须按照ABC的顺序来
	 */
	private String partA;
	private String partB;
	private String partC;
	//一个具体的产品类模型应该做好封装包含get set 方法
	public String getPartA() {
		return partA;
	}
	public String getPartB() {
		return partB;
	}
	public String getPartC() {
		return partC;
	}
	public void setPartA(String partA) {
		this.partA = partA;
	}
	public void setPartB(String partB) {
		this.partB = partB;
	}
	public void setPartC(String partC) {
		this.partC = partC;
	}
}
