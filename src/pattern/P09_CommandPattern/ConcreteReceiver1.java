package pattern.P09_CommandPattern;

/**
 * ����Ľ�����
 * 
 * @author Administrator
 *
 */
public class ConcreteReceiver1 extends Receiver {

	// ÿ�������߶����봦��һ����ҵ���߼�
	@Override
	public void doSomething() {
		System.out.println("����Ľ�����ConcreteReceiver1�����ڴ���һ����ҵ���߼�...");
	}
}
