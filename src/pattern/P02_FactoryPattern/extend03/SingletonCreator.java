package pattern.P02_FactoryPattern.extend03;

import java.lang.reflect.Constructor;

/**
 * ���浥��ģʽ���ù�������һ������ ͨ�����䷽ʽ����������
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
			//����޲ι���
			Constructor constructor = c.getDeclaredConstructor();
			//�����޲ι����ǿɷ��ʵ�
			constructor.setAccessible(true);
			//����һ��ʵ������
			singleton = (Singleton) constructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Singleton getSingleton() {
		return singleton;
	}

}
