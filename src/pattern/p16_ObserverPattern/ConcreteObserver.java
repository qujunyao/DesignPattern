package pattern.p16_ObserverPattern;

/**
 * ����Ĺ۲���
 * 
 * @author Administrator
 *
 */
public class ConcreteObserver implements Observer {

	// ʵ�ָ��·���
	@Override
	public void update() {
		System.out.println("���յ���Ϣ�������д���");
	}

}
