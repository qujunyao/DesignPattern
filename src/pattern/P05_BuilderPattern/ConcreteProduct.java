package pattern.P05_BuilderPattern;

/**
 * ���彨����
 * 
 * @author Administrator
 *
 */
public class ConcreteProduct extends Builder {

	private Product product = new Product();

	/*
	 * ���ò�Ʒ���
	 */
	@Override
	public void setPart() {
		System.out.println("��Ʒ���ڵ��߼�����");
	}

	/*
	 * �齨һ����Ʒ
	 */
	@Override
	public Product buildProduct() {
		return product;
	}

}
