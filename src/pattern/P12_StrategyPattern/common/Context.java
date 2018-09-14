package pattern.P12_StrategyPattern.common;

/**
 * 封装角色
 * 
 * @author Administrator
 *
 */
public class Context {

	//抽象策略
	private Strategy strategy = null;
	
	//构造函数设置具体的策略
	public Context(Strategy s) {
		this.strategy = s;
	}
	
	//封装后的策略方法
	public void doAnything(){
		this.strategy.doSomething();
	}
}
