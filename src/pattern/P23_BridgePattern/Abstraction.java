package pattern.P23_BridgePattern;

/**
 * 抽象化角色
 * 
 * @author Administrator
 *
 */
public abstract class Abstraction {

	// 定义对实现化角色的引用
	private Implementor implementor;

	// 约束子类必须实现该构造函数
	public Abstraction(Implementor imp) {
		this.implementor = imp;
	}

	// 自身的行为和属性
	public void request() {
		this.implementor.doSomething();
		this.implementor.doAnything();
	}

	// 获得实现化角色
	public Implementor getImplementor() {
		return implementor;
	}

}
