package pattern.p16_ObserverPattern;

public class ConcreteSubject extends Subject {

	// 具体的业务
	public void doSomething() {
		/*
		 * 一些业务逻辑
		 */
		super.notifyObserver();
	}

}
