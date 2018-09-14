package pattern.P02_FactoryPattern.common;

/**
 * 具体的产品类：可以有多个，都继承于抽象产品类
 * 
 * @author Administrator
 *
 */
public class ConcreteProduct1 extends Product {

	private String attribute;

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	
	public ConcreteProduct1(String a) {
		this.attribute = a;
	}

	@Override
	public void method2() {
		// TODO 业务逻辑实现。
	}

}
