package pattern.P06_ProxyPattern.common;

/**
 * ��ʵ������
 * 
 * @author Administrator
 *
 */
public class RealSubject implements Subject {

	// ʵ�ַ���
	@Override
	public void request() {
		System.out.println("ҵ���߼�����");
	}

}
