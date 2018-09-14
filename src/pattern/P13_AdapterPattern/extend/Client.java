package pattern.P13_AdapterPattern.extend;

/**
 * ����������ģʽ��������
 * 
 * �����������ģʽ��ͬ���ǣ������������ģʽ����ʹ�ü̳й�ϵ���ӵ�Adaptee�࣬����ʹ��ί�ɹ�ϵ���ӵ�Adaptee�ࡣ
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// ԭ�е�ҵ���߼�
		Target target = new ConcreteTarget();
		target.request();

		// ������������������ɫ����߼�
		Adaptee adaptee = new Adaptee();
		Target target2 = new Adapter(adaptee);
		target2.request();

	}

}
