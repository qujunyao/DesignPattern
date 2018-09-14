package pattern.P01_SingletonPattern.common;

/**
 * ����ģʽͨ�ô��루����ʽ����ģʽ��
 * 
 * @author Administrator
 *
 */
public class Singleton_hungry {

	/*
	 * ����ʽ����ģʽ final���λ�����������ʱ���������޷��ı�ģ� final�����������������ǣ�����������޷��ı䣬������������ǿ��Ըı�ġ�
	 */
	private static final Singleton_hungry singleton = new Singleton_hungry();

	// ���Ʋ����������
	private Singleton_hungry() {

	}

	// ��ȡʵ�����󷽷�
	public static Singleton_hungry getSingleton() {
		return singleton;
	}

	// ���е���������������ʹ��static��
	public static void otherMethod() {

	}
}
