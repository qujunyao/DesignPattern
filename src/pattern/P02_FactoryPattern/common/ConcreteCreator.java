package pattern.P02_FactoryPattern.common;

/**
 * ����Ĺ���ʵ���ࣺ����һ������Ķ���
 * 
 * @author Administrator
 *
 */
public class ConcreteCreator extends Creator {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) product;
	}

}
