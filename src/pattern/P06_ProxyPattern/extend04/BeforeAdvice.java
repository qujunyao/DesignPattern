package pattern.P06_ProxyPattern.extend04;

/**
 * 通知接口实现类
 * 
 * @author Administrator
 *
 */
public class BeforeAdvice implements IAdvice {

	@Override
	public void exec() {
		System.out.println("我是前置通知，我被执行了。");
	}

}
