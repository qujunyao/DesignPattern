package pattern.P02_FactoryPattern.extend02;

/**
 * ����Ĺ���ʵ���ࣺ����һ������Ķ���
 * 
 * @author Administrator
 *
 */
public class ConcreteCreator1 extends Creator {

	@Override
	public Product createProduct() {
		return new ConcreteProduct1();
	}

}
