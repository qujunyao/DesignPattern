package pattern.p16_ObserverPattern;

public class ConcreteSubject extends Subject {

	// �����ҵ��
	public void doSomething() {
		/*
		 * һЩҵ���߼�
		 */
		super.notifyObserver();
	}

}
