package pattern.P06_ProxyPattern.extend04;

/**
 * 动态代理：真实主题类
 * 
 * @author Administrator
 *
 */
public class RealSubject implements Subject {

	// 业务操作
	@Override
	public void doSomething(String str) {
		System.out.println("doSomething---->" + str);
	}

}
