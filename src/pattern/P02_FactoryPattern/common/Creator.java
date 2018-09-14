package pattern.P02_FactoryPattern.common;

/**
 * 抽象工厂：负责定义产品对象的产生
 * 
 * @author Administrator
 *
 */
public abstract class Creator {

	/**
	 * 创建一个产品对象，其输入的参数类型可以自行设置
	 * 通常为String，Enum，Class等，当然也可以为空。
	 * @param c
	 * @return
	 */
	public abstract <T extends Product> T createProduct(Class<T> c);
	
}
