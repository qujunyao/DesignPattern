package pattern.P06_ProxyPattern.extend02;

import java.util.Date;

/**
 * ������
 * 
 * ǿ�ƴ���ģʽ
 * 
 * ǿ�ƴ���ģʽ�ĸ������Ҫ����ʵ��ɫ���ҵ������ɫ�������������ʵ��ɫ���߲�ģ��ֻҪ����getSubject�����Ϳ��Է���
 * ��ʵ��ɫ�����з������������Ͳ���Ҫ����һ���������������Ĺ����Ѿ�����ʵ��ɫ�Լ���ɡ�
 * 
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		// ����һ����ʵ��ɫ
		Subject s1 = new RealSubject("����");
		System.out.println("======================����1=====================");
		System.out.println("��ʼʱ�䣺" + new Date());
		// ��Ҫ�������ͨ�����������ʣ�����Ҫֱ�ӷ������ǲ����ܵġ�
		s1.request();
		System.out.println("����ʱ�䣺" + new Date());
		System.out.println();

		System.out.println("======================����2=====================");
		// ����һ����ʵ��ɫ
		Subject s2 = new RealSubject("����");
		Subject s2proxy = new Proxy(s2);
		System.out.println("��ʼʱ�䣺" + new Date());
		// ����ָ������
		s2proxy.request();
		System.out.println("����ʱ�䣺" + new Date());
		System.out.println();

		System.out.println("======================����3=====================");
		// ����һ����ʵ��ɫ
		Subject s3 = new RealSubject("����");
		Subject s3proxy = s3.getSubject();
		System.out.println("��ʼʱ�䣺" + new Date());
		// ָ���Ĵ���
		s3proxy.request();
		System.out.println("����ʱ�䣺" + new Date());

	}
}
