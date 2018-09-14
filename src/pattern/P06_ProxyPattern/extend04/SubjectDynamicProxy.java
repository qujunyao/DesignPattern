package pattern.P06_ProxyPattern.extend04;

import java.lang.reflect.InvocationHandler;

/**
 * 具体业务动态代理类
 * 
 * @author Administrator
 *
 */
public class SubjectDynamicProxy extends DynamicProxy<Object> {

	public static <T> T newProxyInstance(Subject subject) {
		// 获得Classloader
		ClassLoader loader = subject.getClass().getClassLoader();
		// 活动接口数据
		Class<?>[] classes = subject.getClass().getInterfaces();
		// 获得handler
		InvocationHandler handler = new MyInvocationHandler(subject);
		return newProxyInstance(loader, classes, handler);

	}

}
