package pattern.P08_MediatorPattern;

/**
 * 抽象中介者
 * 
 * @author Administrator
 *
 */
public abstract class Mediator {
	
	//定义同事类
	protected ConcreteColleague1 colleague1;
	protected ConcreteColleague2 colleague2;

	//通过get和set方法把同事类注入进来。
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

	//中介者模式的业务逻辑
	public abstract void doSomething1();

	public abstract void doSomething2();
}
