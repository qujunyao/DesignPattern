package pattern.P01_SingletonPattern.extend;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ����ģʽ��չģʽ�������޵Ķ���ģʽ��
 * 
 * @author Administrator
 *
 */
public class Multition {

	// ָ���ڴ��п��Դ���ʵ���ĸ���
	private static int maxNumberOfObj = 3;

	// ���ʵ���ļ���
	private static Map<Integer, Multition> multitions = new ConcurrentHashMap<>();

	// ���౻���ص�ʱ�򴴽�ָ��������ʵ��
	static {
		for (int i = 0; i < maxNumberOfObj; i++) {
			multitions.put(i, new Multition());
		}
	}

	// ���Ʋ����������
	private Multition() {

	}

	// ��ȡʵ�����󷽷�
	public static Multition getMultition() {
		Random random = new Random();
		return multitions.get(random.nextInt(maxNumberOfObj));
	}

	// ���е���������������ʹ��static��
	public static void otherMethod() {

	}
}
