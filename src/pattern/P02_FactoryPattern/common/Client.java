package pattern.P02_FactoryPattern.common;

/**
 * 场景类
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		
		//通过工厂产生一个对象。
		@SuppressWarnings("unused")
		Product product = creator.createProduct(ConcreteProduct1.class);
		
		/*
		 * 后续的业务逻辑 
		 */
	}
}
