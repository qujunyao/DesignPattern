package pattern.P06_ProxyPattern.extend02;

/**
 * ǿ�ƴ���ĳ���������
 * 
 * @author Administrator
 *
 */
public interface Subject {

	// ����һ������
	public void request();

	/*
	 * ÿ�����󶼿�����һ���Լ��Ĵ��� 
	 * ����������һ��getSubject������ָ�������Լ�����ͨ���ĸ�����
	 */
	public Subject getSubject();
}
