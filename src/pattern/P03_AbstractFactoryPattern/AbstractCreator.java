package pattern.P03_AbstractFactoryPattern;

/**
 * ���󹤳���
 * @author Administrator
 *
 */
public abstract class AbstractCreator {
	
	/**
	 * ����A��Ʒ
	 * @return
	 */
	public abstract AbstractProductA createProductA();
	
	/**
	 * ����B��Ʒ 
	 * @return
	 */
	public abstract AbstractProductB createProductB();

}
