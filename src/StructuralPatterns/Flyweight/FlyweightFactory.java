package StructuralPatterns.Flyweight;

import java.util.HashMap;

class FlyweightFactory{
	//private ArrayList<Flyweight> device=new ArrayList<>();
	/*
	 * 这里用map应该舒服一些
	 */
	private HashMap<String, Flyweight> device=new HashMap<>();
	//设置一个指针
	private int lyCount;
	private int jhjCount;
	private Flyweight flyweight;
	public int getLyCount() {
		return lyCount-1;
	}
	public int getJhjCount() {
		return jhjCount-1;
	}
	public FlyweightFactory() {
		// TODO Auto-generated constructor stub
		lyCount=0;
		jhjCount=0;
		ConcreteFlyweight1 c1=new ConcreteFlyweight1("路由器"+lyCount);
		device.put("路由器"+lyCount++, c1);
		ConcreteFlyweight2 c2=new ConcreteFlyweight2("交换机1"+jhjCount);
		device.put("交换机"+jhjCount++, c2);
	}
	public Flyweight getDevice(String type,int count) {
		if((flyweight=device.get(type+count))!=null) {
			System.out.println("已找到，为你返回");
			return flyweight;
		}else {
			switch (type) {
			case "路由器":

				flyweight=new ConcreteFlyweight1(type+lyCount);
				device.put("路由器"+lyCount++, flyweight);
				System.out.println("无你指定的设备已经为你新建，序列号为："+lyCount);
				return flyweight;

			case "交换机":
				flyweight=new ConcreteFlyweight2(type+jhjCount);
				device.put("交换机"+jhjCount++, flyweight);
				System.out.println("无你指定的设备已经为你新建，序列号为："+jhjCount);
				return flyweight;

			default:
				return null;
			}
		}



	}
}
