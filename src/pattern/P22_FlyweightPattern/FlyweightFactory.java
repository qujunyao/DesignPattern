package pattern.P22_FlyweightPattern;

import java.util.HashMap;

/**
 * 享元工厂
 * 
 * @author Administrator
 *
 */
public class FlyweightFactory {

	// 定一个容器
	private static HashMap<String, Flyweight> pool = new HashMap<>();

	// 享元工厂
	public static Flyweight getFlyweight(String Extrisin) {
		// 需要返回
		Flyweight flyweight = null;
		if (pool.containsKey(Extrisin)) {
			System.out.println(Extrisin + "----直接从池中取。");
			flyweight = pool.get(Extrisin);
		} else {
			System.out.println(Extrisin + "----建立对象并放置到池中。");
			flyweight = new ConcreteFlyweight1(Extrisin);
			pool.put(Extrisin, flyweight);
		}
		return flyweight;
	}
}
