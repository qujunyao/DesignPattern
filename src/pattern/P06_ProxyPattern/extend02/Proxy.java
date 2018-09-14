package pattern.P06_ProxyPattern.extend02;

/**
 * ǿ�ƴ���Ĵ�����
 * 
 * @author Administrator
 *
 */
public class Proxy implements Subject {

	// Ҫ�����ĸ�ʵ����
	private Subject subject = null;

	// ͨ�����캯�����ݴ�����
	public Proxy(Subject subject) {
		this.subject = subject;
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

	/*
	 * ����Ĵ�����ʱ��û�У������Լ���
	 * 
	 * �����ɫҲ�����ٴα��������Ҵ���ķ����ͷ����Լ���
	 * 
	 */
	@Override
	public Subject getSubject() {
		return this;
	}

}
