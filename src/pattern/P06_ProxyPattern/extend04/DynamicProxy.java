package pattern.P06_ProxyPattern.extend04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * ��̬������
 * 
 * @author Administrator
 *
 * @param <T>
 */
public class DynamicProxy<T> {

	@SuppressWarnings("unchecked")
	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
		// Ѱ��JoinPoint���ӵ㣬AOP���ʹ��Ԫ���ݶ���
		if (true) {
			// ִ��һ��ǰ��֪ͨ
			(new BeforeAdvice()).exec();
		}
		// Ѱ��Ŀ�겢���ؽ��
		return (T) Proxy.newProxyInstance(loader, interfaces, h);
	}
}
