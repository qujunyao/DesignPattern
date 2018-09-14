package pattern.P06_ProxyPattern.extend04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 * 
 * @author Administrator
 *
 * @param <T>
 */
public class DynamicProxy<T> {

	@SuppressWarnings("unchecked")
	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
		// 寻找JoinPoint连接点，AOP框架使用元数据定义
		if (true) {
			// 执行一个前置通知
			(new BeforeAdvice()).exec();
		}
		// 寻找目标并返回结果
		return (T) Proxy.newProxyInstance(loader, interfaces, h);
	}
}
