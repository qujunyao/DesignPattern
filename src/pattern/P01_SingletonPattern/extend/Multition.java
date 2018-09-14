package pattern.P01_SingletonPattern.extend;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 单例模式扩展模式：有上限的多例模式。
 * 
 * @author Administrator
 *
 */
public class Multition {

	// 指定内存中可以存在实例的个数
	private static int maxNumberOfObj = 3;

	// 存放实例的集合
	private static Map<Integer, Multition> multitions = new ConcurrentHashMap<>();

	// 在类被加载的时候创建指定个数的实例
	static {
		for (int i = 0; i < maxNumberOfObj; i++) {
			multitions.put(i, new Multition());
		}
	}

	// 限制产生多个对象
	private Multition() {

	}

	// 获取实例对象方法
	public static Multition getMultition() {
		Random random = new Random();
		return multitions.get(random.nextInt(maxNumberOfObj));
	}

	// 类中的其他方法。尽量使用static。
	public static void otherMethod() {

	}
}
