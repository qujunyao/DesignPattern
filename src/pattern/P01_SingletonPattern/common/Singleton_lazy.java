package pattern.P01_SingletonPattern.common;

/**
 * ����ģʽͨ�ô��루����ʽ����ģʽ��
 * 
 * @author Administrator
 *
 */
public class Singleton_lazy {

	// ����ʽ����ģʽ
	private static Singleton_lazy singleton;

	// ���Ʋ����������
	private Singleton_lazy() {

	}

	// ��ȡʵ�����󷽷����̰߳�ȫ�ģ�
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

	// ���е���������������ʹ��static��
	public static void otherMethod() {

	}
}
