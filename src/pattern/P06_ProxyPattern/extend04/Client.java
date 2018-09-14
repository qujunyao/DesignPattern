package pattern.P06_ProxyPattern.extend04;

/**
 * ��̬����ģʽ
 * 
 * ������
 * 
 * Ҫʵ�ֶ�̬�������Ҫ������ �������������ʵ��һ���ӿڡ�
 * ������һ���Ǿ��Եģ�����CGLIB��������ʵ�ֲ���Ҫ�ӿ�Ҳ����ʵ�ֶ�̬����
 * 
 * ʲô�Ƕ�̬����
 * ��̬��������ʵ�ֽ׶β��ù��Ĵ���˭���������н׶β�ָ��������һ������
 * 
 * AOP�����̼��������ľ��ǲ����˶�̬������ơ�
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// ����һ������
		Subject subject = new RealSubject();
		// ��������Ĵ���
		Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
		// �������Ϊ
		proxy.doSomething("Finish");
	}
}
