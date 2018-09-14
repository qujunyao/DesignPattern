package pattern.p16_ObserverPattern;

/**
 * 具体的观察者
 * 
 * @author Administrator
 *
 */
public class ConcreteObserver implements Observer {

	// 实现更新方法
	@Override
	public void update() {
		System.out.println("接收到信息，并进行处理");
	}

}
