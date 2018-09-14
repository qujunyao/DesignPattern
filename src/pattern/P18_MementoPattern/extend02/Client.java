package pattern.P18_MementoPattern.extend02;

/**
 * ��״̬�ı���¼ģʽ��������
 * 
 * ΪʲôҪʹ��HashMap��ֱ��ʹ��Originator����Ŀ�������һ���ܺõķ�����?,���������������������ƻ��˷����˵�ͨ���ԣ�
 * �����ָ�������ʱ����Ҫ�Ըö�����жԳƸ�ֵ������Ҳ���ײ�������
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		originator.setState1("�й�");
		originator.setState2("ǿ��");
		originator.setState3("����");
		System.out.println("======��ʼ��״̬======\n"+originator);
		
		caretaker.setMemento(originator.createMemnto());
		
		originator.setState1("���");
		originator.setState2("�ܹ�");
		originator.setState3("����");
		System.out.println("======�޸ĺ�״̬======\n"+originator);
		
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("======�ָ���״̬======\n"+originator);
		
	}
	
}
