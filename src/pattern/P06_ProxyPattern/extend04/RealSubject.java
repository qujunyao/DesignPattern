package pattern.P06_ProxyPattern.extend04;

/**
 * ��̬������ʵ������
 * 
 * @author Administrator
 *
 */
public class RealSubject implements Subject {

	// ҵ�����
	@Override
	public void doSomething(String str) {
		System.out.println("doSomething---->" + str);
	}

}
