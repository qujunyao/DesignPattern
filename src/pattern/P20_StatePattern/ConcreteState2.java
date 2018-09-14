package pattern.P20_StatePattern;

/**
 * 具体状态角色
 * 
 * @author Administrator
 *
 */
public class ConcreteState2 extends State {

	@SuppressWarnings("static-access")
	@Override
	public void handle1() {
		// 设置当前状态为state1
		super.context.setCurrentState(context.STATE1);
		// 过度到state1状态，由context实现
		super.context.handle1();

	}

	@Override
	public void handle2() {
		// 本状态下必须处理的逻辑
		System.out.println("handle2处理事务中...");
	}

}
