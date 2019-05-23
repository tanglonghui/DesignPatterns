package CreationalPatterns.Prototype;

import java.io.*;

/*
 * java中多重继承接口的语法不要搞错了
 */
 @SuppressWarnings("serial")
class Prototype  implements Cloneable, Serializable {
	 String msg;

	 //使该类支持克隆方法
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		return super.clone();
	}
	//支持深克隆
	Object deepClone() throws IOException, ClassNotFoundException {
		/*创建一个缓冲流用以缓存
		 * 此类实现了一个输出流，其中的数据被写入一个 byte 数组。
		 * 缓冲区会随着数据的不断写入而自动增长。
		 * 可使用 toByteArray() 和 toString() 获取数据。
		*/
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		//创建写入指定流的对象流,流中是个经典的装饰模式
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		//写 当前对象
		oos.writeObject(this);
		//输入流
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();

	}


 }
