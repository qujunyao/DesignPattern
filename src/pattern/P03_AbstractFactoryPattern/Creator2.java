package pattern.P03_AbstractFactoryPattern;

/**
 * ��Ʒ�ȼ�Ϊ2��ʵ����
 * 
 * @author Administrator
 *
 */
public class Creator2 extends AbstractCreator {

	/**
	 * ֻ�����ȼ�Ϊ2��A��Ʒ
	 */
	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	/**
	 * ֻ�����ȼ�Ϊ2��B��Ʒ
	 */
	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
