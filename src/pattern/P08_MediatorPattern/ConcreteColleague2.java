package pattern.P08_MediatorPattern;

/**
 * ͬ����
 * 
 * @author Administrator
 *
 */
public class ConcreteColleague2 extends Colleague {

	// ͨ�����캯�������н���
	public ConcreteColleague2(Mediator m) {
		super(m);
	}

	// ���з���
	public void selfMethod2() {

	}

	// ��������
	public void depMethod2() {
		// �����Լ���ҵ���߼�

		// �Լ����ܴ����ҵ���߼���ί�и��н��ߴ���
		super.mediator.doSomething2();
	}

}
