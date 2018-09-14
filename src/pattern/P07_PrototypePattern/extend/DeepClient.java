package pattern.P07_PrototypePattern.extend;

/**
 * 深拷贝：场景类
 * 
 * 使用原型模式时，引用的成员变量必须满足2个条件才不会被拷贝，一是类的成员变量，而不是方法内变量
 * 二是必须是一个可变的引用变量，而不是一个原始原型或不可变对象。
 * 
 * @author Administrator
 *
 */
public class DeepClient {

	public static void main(String[] args) {
		DeepCopy DeepCopy = new DeepCopy();
		DeepCopy.setValue("张三");
		DeepCopy copy = DeepCopy.clone();
		copy.setValue("李四");
		System.out.println(DeepCopy.getValue());
	}
}
