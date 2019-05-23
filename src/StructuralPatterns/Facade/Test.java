package StructuralPatterns.Facade;
/*
 * 外观模式（Facade），亦称“过程模式”。学校课程评价模式之一。
 * 美国教育学者斯泰克1967 年在所著《教育评价的外观》中提出。
*按照描述和判断资料来评价课程，关键的活动是在课程实施的全过程中进行观察和搜集意见，以了解人们对课程的不同看法。
*这种模式不限于检查教学的成果，重视描述和判断教学过程中各种复杂、动态的现象和事物。
*/
/*
 * 包含角色：
 * Facade（外观角色）
 * SubSystem（子系统角色）
 * 简单说：通过Facade 实现 子系统方法的调用,类似于总的控制器。
 * 
 */
public class Test {
public static void main(String[] args) {
	Facade facade=new Facade();
	facade.control1();
	facade.control2();
}
}
