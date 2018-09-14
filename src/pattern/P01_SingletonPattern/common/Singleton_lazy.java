package pattern.P01_SingletonPattern.common;

/**
 * 单例模式通用代码（懒汉式单例模式）
 * 
 * @author Administrator
 *
 */
public class Singleton_lazy {

	// 懒汉式单例模式
	private static Singleton_lazy singleton;

	// 限制产生多个对象
	private Singleton_lazy() {

	}

	// 获取实例对象方法（线程安全的）
	public static Singleton_lazy getSingleton() {
		if (singleton == null) {
			synchronized (Singleton_lazy.class) {
				if (singleton == null) {
					singleton = new Singleton_lazy();
				}
			}
		}
		return singleton;
	}

	// 类中的其他方法。尽量使用static。
	public static void otherMethod() {

	}
}
