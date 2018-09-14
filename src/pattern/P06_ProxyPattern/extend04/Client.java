package pattern.P06_ProxyPattern.extend04;

/**
 * 动态代理模式
 * 
 * 场景类
 * 
 * 要实现动态代理的首要条件是 ：被代理类必须实现一个接口。
 * （并不一定是绝对的，比如CGLIB技术可以实现不需要接口也可以实现动态代理）
 * 
 * 什么是动态代理？
 * 动态代理是在实现阶段不用关心代理谁，而在运行阶段才指定代理哪一个对象。
 * 
 * AOP切面编程技术，核心就是采用了动态代理机制。
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// 定义一个主题
		Subject subject = new RealSubject();
		// 定义主题的代理
		Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
		// 代理的行为
		proxy.doSomething("Finish");
	}
}
