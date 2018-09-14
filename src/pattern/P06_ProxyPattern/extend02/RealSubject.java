package pattern.P06_ProxyPattern.extend02;

/**
 * 强制代理模式的真实主题类
 * 
 * @author Administrator
 *
 */
public class RealSubject implements Subject {

	@SuppressWarnings("unused")
	private String name = "";

	// 我的代理是谁。
	private Subject proxy = null;

	public RealSubject(String name) {
		this.name = name;
	}

	// 实现方法
	@Override
	public void request() {
		if (this.isProxy()) {
			System.out.println("业务逻辑处理...");
		} else {
			System.out.println("请使用指定的代理访问。");
		}
	}

	// 找到自己的代理
	@Override
	public Subject getSubject() {
		this.proxy = new Proxy(this);
		return this.proxy;
	}

	/*
	 * 校验是否是代理访问 增加了一个私有方法，检查是否是自己的代理，是指定的代理则允许访问，否则不允许访问。
	 */
	private boolean isProxy() {
		if (this.proxy == null) {
			return false;
		} else {
			return true;
		}
	}

}
