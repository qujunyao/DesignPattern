package pattern.P02_FactoryPattern.extend01;

/**
 * 工厂模式的扩展：简单工厂模式（一个模型只需要一个工厂类，简化工厂的创建过程，但不便于扩展工厂类。）
 * 
 * @author Administrator
 *
 */
public class ConcreteCreator  {

	/**
	 * 将工厂方法设置为静态类型
	 * @param c
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) product;
	}

}
