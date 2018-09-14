package pattern.P20_StatePattern;

/**
 * 具体状态角色
 * 
 * @author Administrator
 *
 */
public class ConcreteState1 extends State {

	@Override
	public void handle1() {
		// 本状态下必须处理的逻辑
		System.out.println("handle1处理事务中...");
	}

	@SuppressWarnings("static-access")
	@Override
	public void handle2() {
		// 设置当前状态为state2
		super.context.setCurrentState(context.STATE2);
		// 过度到state2状态，由context实现
		super.context.handle2();

	}

}
