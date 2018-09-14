package pattern.p04_TemplateMethodPattern.extend;

/**
 * 具体的模板类
 * 
 * @author Administrator
 *
 */
public class ConcreteClass1 extends AbstractClass {

	private boolean can = true;

	// 实现基本方法
	@Override
	protected void doSomething() {
		System.out.println("模板类1业务逻辑处理1...");
	}

	@Override
	protected void doAnything() {
		System.out.println("模板类1业务逻辑处理2...");

	}

	@Override
	protected boolean canDoSomething() {
		return can;
	}

	public void setCan(boolean can) {
		this.can = can;
	}

}
