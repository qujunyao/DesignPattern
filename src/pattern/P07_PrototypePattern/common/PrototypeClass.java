package pattern.P07_PrototypePattern.common;

/**
 * 原型模式：
 * 
 * 不通过new关键字来产生一个对象，而是通过对象复制来实现的模式叫做原型模式。
 * 
 * 优点：
 * 原型模式是在内存二进制流的拷贝，要比直接new一个对象性能好的多，特别是要在一个循环内产生大量对象时，原型模式可以更好的体现他的有点。
 * 
 * 缺点：
 * 通过原型模式产生的对象，不会执行构造函数。不受构造函数的约束。
 * 
 * 使用原型模式时，类的成员变量上不要加上final关键字。
 * 
 * @author Administrator
 *
 */
public class PrototypeClass implements Cloneable {

	@Override
	public PrototypeClass clone() {
		PrototypeClass prototypeClass = null;
		try {
			prototypeClass = (PrototypeClass) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototypeClass;
	}
}
