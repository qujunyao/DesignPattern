package pattern.P06_ProxyPattern.extend04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类的Handler类
 * 
 * @author Administrator
 *
 */
public class MyInvocationHandler implements InvocationHandler {

	//被代理的对象
	private Object target;

	//通过构造函数传递一个对象
	public MyInvocationHandler(Object object) {
		this.target = object;
	}

	//代理方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//执行被代理的方法
		return method.invoke(this.target, args);
	}

}
