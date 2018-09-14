package pattern.P07_PrototypePattern.extend;

/**
 * 浅拷贝：场景类
 * 
 * 浅拷贝：Object类提供的clone方法只是拷贝对象本身，其对象内部的数组和引用对象等，
 * 都不拷贝，还是指向原生对象的内部地址。这是一种不安全的方式，在实际应用中比较少见。
 * 
 * 
 * 
 * @author Administrator
 *
 */
public class ShallowClient {

	public static void main(String[] args) {
		ShallowCopy shallowCopy = new ShallowCopy();
		shallowCopy.setValue("张三");
		ShallowCopy copy = shallowCopy.clone();
		copy.setValue("李四");
		System.out.println(shallowCopy.getValue());
	}
}
