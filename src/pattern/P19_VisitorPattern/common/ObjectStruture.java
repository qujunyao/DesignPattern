package pattern.P19_VisitorPattern.common;

import java.util.Random;

/**
 * �ṹ����
 * 
 * @author Administrator
 *
 */
public class ObjectStruture {

	// ���ɶ�������������һ����������ģ��ʵ��
	public static Element createElement() {
		Random random = new Random();
		if (random.nextInt(100) > 50) {
			return new ConcreteElement1();
		} else {
			return new ConcreteElement2();
		}
	}
}
