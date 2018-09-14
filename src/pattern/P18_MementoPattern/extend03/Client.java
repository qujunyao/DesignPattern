package pattern.P18_MementoPattern.extend03;

/**
 * �౸�ݵı���¼ģʽ��������
 * 
 * ���Իָ���ָ�����ݣ���Ҫע����ǣ��ڴ�������⣬�ñ���һ��������װ���ڴ棬û���κ����ٵ��������Ƿǳ�Σ�յġ�
 * ��ˣ���ϵͳ���ʱ��Ҫ�ϸ��޶�����¼�Ĵ�������������map�����ޣ�����ϵͳ�����ڴ�����������
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
		//������һ������¼
		caretaker.setMemento("001",originator.createMemnto());
		
		originator.setState1("����");
		originator.setState2("ƽ��");
		originator.setState3("����");
		System.out.println("======�޸�״̬======\n"+originator);
		//�����ڶ�������¼
		caretaker.setMemento("002",originator.createMemnto());
		
		originator.setState1("���");
		originator.setState2("�ܹ�");
		originator.setState3("����");
		System.out.println("======�޸ĺ�״̬======\n"+originator);
		
		//�ָ�ָ���ı���¼
		originator.restoreMemento(caretaker.getMemento("002"));
		System.out.println("======�ָ���״̬======\n"+originator);
		
	}
	
}
