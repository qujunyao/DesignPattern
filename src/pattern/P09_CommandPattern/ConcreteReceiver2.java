package pattern.P09_CommandPattern;

/**
 * 具体的接受者
 * 
 * @author Administrator
 *
 */
public class ConcreteReceiver2 extends Receiver {

	// 每个接受者都必须处理一定的业务逻辑
	@Override
	public void doSomething() {
		System.out.println("具体的接受者ConcreteReceiver2，正在处理一定的业务逻辑...");

	}
}
