package pattern.P02_FactoryPattern.extend02;

/**
 * 多工厂模式的抽象工厂
 * 
 * @author Administrator
 *
 */
public abstract class Creator {

	/**
	 * 抽象方法中已经不再需要传递相关参数了，
	 * 因为每一个具体的工厂都已经非常明确自己的职责：创建自己负责的产品对象
	 * 
	 * @return
	 */
	public abstract Product createProduct();

}
