package pattern.P02_FactoryPattern.extend01;

/**
 * �򵥹���ģʽ��������
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		
		//ͨ���򵥹�������һ������
		@SuppressWarnings("unused")
		Product product = ConcreteCreator.createProduct(ConcreteProduct1.class);
		
		/*
		 * ������ҵ���߼� 
		 */
	}
}
