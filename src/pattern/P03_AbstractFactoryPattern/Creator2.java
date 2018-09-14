package pattern.P03_AbstractFactoryPattern;

/**
 * 产品等级为2的实现类
 * 
 * @author Administrator
 *
 */
public class Creator2 extends AbstractCreator {

	/**
	 * 只生产等级为2的A产品
	 */
	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	/**
	 * 只生产等级为2的B产品
	 */
	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
