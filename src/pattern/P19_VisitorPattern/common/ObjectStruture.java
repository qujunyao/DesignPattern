package pattern.P19_VisitorPattern.common;

import java.util.Random;

/**
 * 结构对象
 * 
 * @author Administrator
 *
 */
public class ObjectStruture {

	// 生成对象器，这里用一个工厂方法模拟实现
	public static Element createElement() {
		Random random = new Random();
		if (random.nextInt(100) > 50) {
			return new ConcreteElement1();
		} else {
			return new ConcreteElement2();
		}
	}
}
