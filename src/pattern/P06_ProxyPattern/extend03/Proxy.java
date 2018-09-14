package pattern.P06_ProxyPattern.extend03;

import pattern.P06_ProxyPattern.common.RealSubject;
import pattern.P06_ProxyPattern.common.Subject;

/**
 * 虚拟代理的代理类
 * 
 * 在需要的时候才初始化真实角色，可以避免被代理对象较多而引起的初始化缓慢的问题，
 * 其缺点是需要在每个方法（实现接口中的方法）中判断真实角色是否被创建。
 * 
 * @author Administrator
 *
 */
public class Proxy implements Subject {

	// 要代理哪个实现类
	private Subject subject = null;

	// 实现接口中的方法
	@Override
	public void request() {
		this.before();
		/*
		 * 判断一下真实角色是否被初始化
		 */
		if (this.subject == null) {
			subject = new RealSubject();
		}
		this.subject.request();
		this.after();
	}

	// 预处理
	private void before() {
		System.out.println("before do something");
	}

	// 善后处理
	private void after() {
		System.out.println("after do something.");
	}

}
