package pattern.P08_MediatorPattern;

/**
 * ͬ����
 * 
 * @author Administrator
 *
 */
public class ConcreteColleague1 extends Colleague {

	// ͨ�����캯�������н���
	public ConcreteColleague1(Mediator m) {
		super(m);
	}

	// ���з���
	public void selfMethod1() {

	}

	// ��������
	public void depMethod1() {
		// �����Լ���ҵ���߼�

		// �Լ����ܴ����ҵ���߼���ί�и��н��ߴ���
		super.mediator.doSomething1();
	}

}
