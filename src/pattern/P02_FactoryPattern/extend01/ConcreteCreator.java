package pattern.P02_FactoryPattern.extend01;

/**
 * ����ģʽ����չ���򵥹���ģʽ��һ��ģ��ֻ��Ҫһ�������࣬�򻯹����Ĵ������̣�����������չ�����ࡣ��
 * 
 * @author Administrator
 *
 */
public class ConcreteCreator  {

	/**
	 * ��������������Ϊ��̬����
	 * @param c
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) product;
	}

}
