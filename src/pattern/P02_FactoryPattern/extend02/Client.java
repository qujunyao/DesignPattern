package pattern.P02_FactoryPattern.extend02;

/**
 * 多工厂模式的场景类
 * 
 * @author Administrator
 *
 */
public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//1号工厂产生一个对象。
		Product product1 = (new ConcreteCreator1()).createProduct();
		
		//2号工厂产生一个对象。
		Product product2 = (new ConcreteCreator2()).createProduct();
		
	}
}
