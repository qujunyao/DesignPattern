package pattern.P08_MediatorPattern;

/**
 * �н���
 * 
 * @author Administrator
 *
 */
public class ConcreteMediator extends Mediator {

	// ����ͬ����ķ�����ֻҪ��public���������Ե��á�
	@Override
	public void doSomething1() {
		if (colleague1 == null) {
			super.setColleague1(new ConcreteColleague1(this));
		}
		if (colleague2 == null) {
			super.setColleague2(new ConcreteColleague2(this));
		}
		super.getColleague1().selfMethod1();
		super.getColleague2().selfMethod2();
	}

	@Override
	public void doSomething2() {
		if (colleague1 == null) {
			super.setColleague1(new ConcreteColleague1(this));
		}
		if (colleague2 == null) {
			super.setColleague2(new ConcreteColleague2(this));
		}
		super.getColleague1().selfMethod1();
		super.getColleague2().selfMethod2();
	}

}
