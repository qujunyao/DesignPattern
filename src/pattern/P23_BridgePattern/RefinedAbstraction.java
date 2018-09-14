package pattern.P23_BridgePattern;

/**
 * 具体抽象化角色
 * 
 * @author Administrator
 *
 */
public class RefinedAbstraction extends Abstraction {

	// 覆写构造函数
	public RefinedAbstraction(Implementor imp) {
		super(imp);
	}

	// 修正父类的行为
	public void request() {
		/*
		 * 业务处理...
		 */
		super.request();
		super.getImplementor().doAnything();
	}

}
