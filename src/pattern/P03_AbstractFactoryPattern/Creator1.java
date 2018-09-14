package pattern.P03_AbstractFactoryPattern;

public class Creator1 extends AbstractCreator {

	/**
	 * ֻ�����ȼ�Ϊ1��A��Ʒ
	 */
	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	/**
	 * ֻ�����ȼ�Ϊ1��B��Ʒ
	 */
	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
