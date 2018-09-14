package pattern.P02_FactoryPattern.extend01;

/**
 * 简单工厂模式：场景类
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		
		//通过简单工厂产生一个对象。
		@SuppressWarnings("unused")
		Product product = ConcreteCreator.createProduct(ConcreteProduct1.class);
		
		/*
		 * 后续的业务逻辑 
		 */
	}
}
