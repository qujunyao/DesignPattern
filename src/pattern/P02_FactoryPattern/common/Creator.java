package pattern.P02_FactoryPattern.common;

/**
 * ���󹤳����������Ʒ����Ĳ���
 * 
 * @author Administrator
 *
 */
public abstract class Creator {

	/**
	 * ����һ����Ʒ����������Ĳ������Ϳ�����������
	 * ͨ��ΪString��Enum��Class�ȣ���ȻҲ����Ϊ�ա�
	 * @param c
	 * @return
	 */
	public abstract <T extends Product> T createProduct(Class<T> c);
	
}
