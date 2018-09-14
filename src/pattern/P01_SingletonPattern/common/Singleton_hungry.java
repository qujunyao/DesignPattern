package pattern.P01_SingletonPattern.common;

/**
 * 单例模式通用代码（饿汉式单例模式）
 * 
 * @author Administrator
 *
 */
public class Singleton_hungry {

	/*
	 * 饿汉式单例模式 final修饰基本类型数据时，数据是无法改变的， final修饰引用类型数据是，对象的引用无法改变，但对象的内容是可以改变的。
	 */
	private static final Singleton_hungry singleton = new Singleton_hungry();

	// 限制产生多个对象
	private Singleton_hungry() {

	}

	// 获取实例对象方法
	public static Singleton_hungry getSingleton() {
		return singleton;
	}

	// 类中的其他方法。尽量使用static。
	public static void otherMethod() {

	}
}
