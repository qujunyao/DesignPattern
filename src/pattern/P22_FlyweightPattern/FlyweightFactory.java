package pattern.P22_FlyweightPattern;

import java.util.HashMap;

/**
 * ��Ԫ����
 * 
 * @author Administrator
 *
 */
public class FlyweightFactory {

	// ��һ������
	private static HashMap<String, Flyweight> pool = new HashMap<>();

	// ��Ԫ����
	public static Flyweight getFlyweight(String Extrisin) {
		// ��Ҫ����
		Flyweight flyweight = null;
		if (pool.containsKey(Extrisin)) {
			System.out.println(Extrisin + "----ֱ�Ӵӳ���ȡ��");
			flyweight = pool.get(Extrisin);
		} else {
			System.out.println(Extrisin + "----�������󲢷��õ����С�");
			flyweight = new ConcreteFlyweight1(Extrisin);
			pool.put(Extrisin, flyweight);
		}
		return flyweight;
	}
}
