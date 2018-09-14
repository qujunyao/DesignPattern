package pattern.P08_MediatorPattern;

/**
 * 同事类
 * 
 * @author Administrator
 *
 */
public class ConcreteColleague2 extends Colleague {

	// 通过构造函数传递中介者
	public ConcreteColleague2(Mediator m) {
		super(m);
	}

	// 自有方法
	public void selfMethod2() {

	}

	// 依赖方法
	public void depMethod2() {
		// 处理自己的业务逻辑

		// 自己不能处理的业务逻辑，委托给中介者处理
		super.mediator.doSomething2();
	}

}
