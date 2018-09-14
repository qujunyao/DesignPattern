package pattern.P06_ProxyPattern.extend04;

import java.lang.reflect.InvocationHandler;

/**
 * ����ҵ��̬������
 * 
 * @author Administrator
 *
 */
public class SubjectDynamicProxy extends DynamicProxy<Object> {

	public static <T> T newProxyInstance(Subject subject) {
		// ���Classloader
		ClassLoader loader = subject.getClass().getClassLoader();
		// ��ӿ�����
		Class<?>[] classes = subject.getClass().getInterfaces();
		// ���handler
		InvocationHandler handler = new MyInvocationHandler(subject);
		return newProxyInstance(loader, classes, handler);

	}

}
