package pattern.P08_MediatorPattern;

/**
 * 中介者
 * 
 * @author Administrator
 *
 */
public class ConcreteMediator extends Mediator {

	// 调用同事类的方法，只要是public方法都可以调用。
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
