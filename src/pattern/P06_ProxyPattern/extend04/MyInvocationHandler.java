package pattern.P06_ProxyPattern.extend04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��̬�������Handler��
 * 
 * @author Administrator
 *
 */
public class MyInvocationHandler implements InvocationHandler {

	//������Ķ���
	private Object target;

	//ͨ�����캯������һ������
	public MyInvocationHandler(Object object) {
		this.target = object;
	}

	//������
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//ִ�б�����ķ���
		return method.invoke(this.target, args);
	}

}
