package pattern.P20_StatePattern;

/**
 * 环境角色
 * 
 * 环境角色有2个不成文的约束：
 * 1、把状态对象声明成静态常量，有几个状态就声明几个静态常量。
 * 2、环境角色具有状态抽象角色的所有行为，具体执行使用委托方式。
 * 
 * @author Administrator
 *
 */
public class Context {

	// 定义状态
	public final static State STATE1 = new ConcreteState1();
	public final static State STATE2 = new ConcreteState2();

	// 当前状态
	private State currentState;

	// 获得当前状态
	public State getCurrentState() {
		return currentState;
	}

	// 设置当前状态
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
		// 切换状态
		this.currentState.setContext(this);
	}

	// 行为委托1
	public void handle1() {
		this.currentState.handle1();
	}

	// 行为委托1
	public void handle2() {
		this.currentState.handle2();
	}

}
