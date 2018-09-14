package pattern.P08_MediatorPattern;

/**
 * �����н���
 * 
 * @author Administrator
 *
 */
public abstract class Mediator {
	
	//����ͬ����
	protected ConcreteColleague1 colleague1;
	protected ConcreteColleague2 colleague2;

	//ͨ��get��set������ͬ����ע�������
	public ConcreteColleague1 getColleague1() {
		return colleague1;
	}

	public void setColleague1(ConcreteColleague1 colleague1) {
		this.colleague1 = colleague1;
	}

	public ConcreteColleague2 getColleague2() {
		return colleague2;
	}

	public void setColleague2(ConcreteColleague2 colleague2) {
		this.colleague2 = colleague2;
	}

	//�н���ģʽ��ҵ���߼�
	public abstract void doSomething1();

	public abstract void doSomething2();
}
