package BehavioralPatterns.Interpreter;

import java.util.HashMap;

/*
 *
 */
class Context{
	/*
	 * 环境类，上下文
	 * 假设我们要把一句英文翻译为中文
	 * 例如 hello world
	 * 翻译成  你好 世界
	 *(>.<)这里简单一点学教材做加减的解释器，省略环境类
	 */
	private HashMap<String, String> map=new HashMap<>();
	//往环境中设值
	public void assign(String key,String value) {
		map.put(key, value);
	}
	//获取环境中的值
	String lookup(String key){
		return map.get(key);
	}
	public void initData() {
		//
		map.put("hello", "你好");
		map.put("world", "世界");
	}

}
