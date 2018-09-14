package pattern.P06_ProxyPattern.extend02;

/**
 * 强制代理的抽象主题类
 * 
 * @author Administrator
 *
 */
public interface Subject {

	// 定义一个方法
	public void request();

	/*
	 * 每个对象都可以找一下自己的代理 
	 * 仅仅增加了一个getSubject方法，指定访问自己必须通过哪个代理。
	 */
	public Subject getSubject();
}
