package pattern.P02_FactoryPattern.extend03;

import java.lang.reflect.Constructor;

/**
 * 代替单例模式：用工厂创建一个单例 通过反射方式创建单例。
 * 
 * @author Administrator
 *
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class SingletonCreator {

	private static Singleton singleton;

	static {
		try {
			Class c = Class.forName(Singleton.class.getName());
			//获得无参构造
			Constructor constructor = c.getDeclaredConstructor();
			//设置无参构造是可访问的
			constructor.setAccessible(true);
			//产生一个实例对象
			singleton = (Singleton) constructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Singleton getSingleton() {
		return singleton;
	}

}
