package pattern.P02_FactoryPattern.extend04;

/**
 * 延迟加载工厂的场景类
 * 
 * @author Administrator
 *
 */
public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//工厂产生一个对象。
		Product product1 = ProductFactory.createProduct("product1");
		
	}
}
