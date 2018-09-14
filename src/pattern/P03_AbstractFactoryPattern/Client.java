package pattern.P03_AbstractFactoryPattern;

/**
 * ���󹤳�ģʽ ��������
 * 
 * ���󹤳������ȱ�������չ�鷳��
 * 
 * @author Administrator
 *
 */
public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//����2������
		AbstractCreator a = new Creator1();
		AbstractCreator b = new Creator2();
		//������ƷA1����
		AbstractProductA A1 = a.createProductA();
		//������ƷA2����
		AbstractProductA A2 = b.createProductA();
		//������ƷB1����
		AbstractProductB B1 = a.createProductB();
		//������ƷB2����
		AbstractProductB B2 = b.createProductB();
	}
}
