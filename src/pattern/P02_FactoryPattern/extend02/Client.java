package pattern.P02_FactoryPattern.extend02;

/**
 * �๤��ģʽ�ĳ�����
 * 
 * @author Administrator
 *
 */
public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//1�Ź�������һ������
		Product product1 = (new ConcreteCreator1()).createProduct();
		
		//2�Ź�������һ������
		Product product2 = (new ConcreteCreator2()).createProduct();
		
	}
}
