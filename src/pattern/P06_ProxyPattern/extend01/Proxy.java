package pattern.P06_ProxyPattern.extend01;

/**
 * ��ͨ����Ĵ�����
 * 
 * @author Administrator
 *
 */
public class Proxy implements Subject {

	// Ҫ�����ĸ�ʵ����
	private Subject subject = null;

	// Ĭ�ϱ�������
	public Proxy() {
		this.subject = new Proxy();
	}

	// ͨ�����캯�����ݴ�����
	public Proxy(Subject subject) {
		this.subject = subject;
	}
	
	public Proxy(String name) {
		try {
			subject = new RealSubject(this, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ʵ�ֽӿ��еķ���
	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}

	// Ԥ����
	private void before() {
		System.out.println("before do something");
	}

	// �ƺ���
	private void after() {
		System.out.println("after do something.");
	}

}
