package pattern.P06_ProxyPattern.extend02;

/**
 * 强制代理的代理类
 * 
 * @author Administrator
 *
 */
public class Proxy implements Subject {

	// 要代理哪个实现类
	private Subject subject = null;

	// 通过构造函数传递代理者
	public Proxy(Subject subject) {
		this.subject = subject;
	}
	
	// 实现接口中的方法
	@Override
	public void request() {
		this.before();
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

	/*
	 * 代理的代理暂时还没有，就是自己。
	 * 
	 * 代理角色也可以再次被代理，查找代理的方法就返回自己。
	 * 
	 */
	@Override
	public Subject getSubject() {
		return this;
	}

}
