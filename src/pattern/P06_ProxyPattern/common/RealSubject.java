package pattern.P06_ProxyPattern.common;

/**
 * 真实主题类
 * 
 * @author Administrator
 *
 */
public class RealSubject implements Subject {

	// 实现方法
	@Override
	public void request() {
		System.out.println("业务逻辑处理");
	}

}
