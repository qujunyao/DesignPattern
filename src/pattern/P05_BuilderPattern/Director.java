package pattern.P05_BuilderPattern;

/**
 * ������
 * 
 * @author Administrator
 *
 */
public class Director {

	private Builder builder = new ConcreteProduct();

	// ������ͬ�Ĳ�Ʒ
	public Product getAProduct() {
		builder.setPart();
		/*
		 * ���ò�ͬ�������������ͬ�Ĳ�Ʒ
		 */
		return builder.buildProduct();
	}

	// ������ͬ�Ĳ�Ʒ
	public Product getBProduct() {
		builder.setPart();
		/*
		 * ���ò�ͬ�������������ͬ�Ĳ�Ʒ
		 */
		return builder.buildProduct();
	}

	// �Դ�����....
}
