package pattern.P02_FactoryPattern.common;

/**
 * ����Ĳ�Ʒ�ࣺ�����ж�������̳��ڳ����Ʒ��
 * 
 * @author Administrator
 *
 */
public class ConcreteProduct1 extends Product {

	private String attribute;

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	
	public ConcreteProduct1(String a) {
		this.attribute = a;
	}

	@Override
	public void method2() {
		// TODO ҵ���߼�ʵ�֡�
	}

}
