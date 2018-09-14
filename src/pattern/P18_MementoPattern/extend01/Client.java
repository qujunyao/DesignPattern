package pattern.P18_MementoPattern.extend01;

/**
 * clone����ʽ�ı���¼ģʽ��������
 * 
 * �����˽�ɫ�ں��˷����˽�ɫ�ͱ���¼��ɫ������˫�ع�Ч�����򾫼򣬸߲�ģ����������١�
 * clone��ʽ�ı���¼ģʽ������ʹ���ڱȽ� �򵥵ĳ������߱Ƚϵ�һ�ĳ�����������Ҫ�������Ķ���������ص���Ϲ�ϵ
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// ���巢����
		Originator originator = new Originator();
		// ������ʼ״̬
		originator.setState("��ʼ״̬...");
		System.out.println("��ʼ״̬��:" + originator.getState());
		// ��������
		originator.createMemento();
		// �޸�״̬
		originator.setState("�޸ĺ��״̬...");
		System.out.println("�޸ĺ��״̬��:" + originator.getState());
		// �ָ���ԭ
		originator.restoreMemento();
		System.out.println("�ָ����״̬��:" + originator.getState());
	}
}
