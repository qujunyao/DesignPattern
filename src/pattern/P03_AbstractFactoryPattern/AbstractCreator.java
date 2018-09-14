package pattern.P03_AbstractFactoryPattern;

/**
 * 抽象工厂类
 * @author Administrator
 *
 */
public abstract class AbstractCreator {
	
	/**
	 * 创建A产品
	 * @return
	 */
	public abstract AbstractProductA createProductA();
	
	/**
	 * 创建B产品 
	 * @return
	 */
	public abstract AbstractProductB createProductB();

}
