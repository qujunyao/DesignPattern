package pattern.P02_FactoryPattern.common;

/**
 * ������
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		
		//ͨ����������һ������
		@SuppressWarnings("unused")
		Product product = creator.createProduct(ConcreteProduct1.class);
		
		/*
		 * ������ҵ���߼� 
		 */
	}
}
