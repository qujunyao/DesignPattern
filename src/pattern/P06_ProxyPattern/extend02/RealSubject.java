package pattern.P06_ProxyPattern.extend02;

/**
 * ǿ�ƴ���ģʽ����ʵ������
 * 
 * @author Administrator
 *
 */
public class RealSubject implements Subject {

	@SuppressWarnings("unused")
	private String name = "";

	// �ҵĴ�����˭��
	private Subject proxy = null;

	public RealSubject(String name) {
		this.name = name;
	}

	// ʵ�ַ���
	@Override
	public void request() {
		if (this.isProxy()) {
			System.out.println("ҵ���߼�����...");
		} else {
			System.out.println("��ʹ��ָ���Ĵ�����ʡ�");
		}
	}

	// �ҵ��Լ��Ĵ���
	@Override
	public Subject getSubject() {
		this.proxy = new Proxy(this);
		return this.proxy;
	}

	/*
	 * У���Ƿ��Ǵ������ ������һ��˽�з���������Ƿ����Լ��Ĵ�����ָ���Ĵ�����������ʣ�����������ʡ�
	 */
	private boolean isProxy() {
		if (this.proxy == null) {
			return false;
		} else {
			return true;
		}
	}

}
