package pattern.P09_CommandPattern;

/**
 * ����ģʽ��������
 * 
 * 
 * ����ģʽ��һ�����ھ�ģʽ���䶨��Ϊ����һ�������װ��һ�����󣬴Ӷ�����ʹ�ò�ͬ������ѿͻ��˲��������������Ŷӻ��߼�¼������־��
 * �����ṩ����ĳ����ͻָ����ܡ�
 * 
 * ����ģʽ��3����ɫ��
 * 1��Receiver�����߽�ɫ���ý�ɫ���Ǹɻ���Ľ�ɫ���������������Ӧ�ñ�ִ�еġ�
 * 2��Command�����ɫ����Ҫִ�е��������������������
 * 3��Invoker�����˽�ɫ(�����߽�ɫ)�����ܵ������ִ�����
 * 
 * ����ģʽ���ŵ㣺
 * 1������������߽�ɫ�ͽ����߽�ɫ֮��û���κ�������ϵ��������ʵ�ֹ���ʱֻ�����Command�������execute�������ɣ�����Ҫ֪�����ĸ�������ִ�С�
 * 2������չ�ԣ�Command��������Էǳ����׵���չ����������Invoker�͸߲��ģ��Client���������صĴ�����ϡ�
 * 3������ģʽ�������ģʽ������㣺����ģʽ���Խ������ģʽ��ʵ��������������񣻽��ģ�巽��ģʽ������Լ���Command������������⡣
 * 
 * ����ģʽ��ȱ�㣺
 * Command�����������͡� 
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		//�״�����������
		Invoker invoker = new Invoker();
		//����һ�����͸������ߵ�����
		Command command = new ConcreteCommand1();
		//�������������ȥִ��
		invoker.setCommand(command);
		invoker.action();
		
		Command command2 = new CancelDeleteCommand();
		invoker.setCommand(command2);
		invoker.action();

	}
}
