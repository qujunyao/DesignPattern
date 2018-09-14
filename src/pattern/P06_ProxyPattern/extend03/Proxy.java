package pattern.P06_ProxyPattern.extend03;

import pattern.P06_ProxyPattern.common.RealSubject;
import pattern.P06_ProxyPattern.common.Subject;

/**
 * �������Ĵ�����
 * 
 * ����Ҫ��ʱ��ų�ʼ����ʵ��ɫ�����Ա��ⱻ�������϶������ĳ�ʼ�����������⣬
 * ��ȱ������Ҫ��ÿ��������ʵ�ֽӿ��еķ��������ж���ʵ��ɫ�Ƿ񱻴�����
 * 
 * @author Administrator
 *
 */
public class Proxy implements Subject {

	// Ҫ�����ĸ�ʵ����
	private Subject subject = null;

	// ʵ�ֽӿ��еķ���
	@Override
	public void request() {
		this.before();
		/*
		 * �ж�һ����ʵ��ɫ�Ƿ񱻳�ʼ��
		 */
		if (this.subject == null) {
			subject = new RealSubject();
		}
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
