package StructuralPatterns.Adapter;



/*
 * 适配器模式（有时候也称包装样式或者包装）将一个类的接口适配成用户所期待的。
 * 一个适配允许通常因为接口不兼容而不能在一起工作的类工作在一起，
 * 做法是将类自己的接口包裹在一个已存在的类中。
 */
/*
 * 包含角色：
 * Target（目标抽象类）
 * Adapter（适配器类）
 * Adaptee（适配者类）
 * 简单说：
 * 使Target通过Adapter（适配器类）适配后可以自己类中使用 Adaptee（适配者类）中的方法
 * 我们假设target保存Stirng类型的数据的类；
 * 而Adaptee是用int保存
 */
class Test {
	public static void main(String[] args) {
		//
		Adaptee adaptee=new Adaptee();
		adaptee.msg=11;
		Target target=new Adapter(adaptee);
		target.show();
		System.out.println(""+target.msg.getClass());
		
	}
	

}
