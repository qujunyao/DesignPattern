package pattern.P08_MediatorPattern;

/**
 * �н���ģʽ��������
 * 
 * ���壺��һ���н��߶����װһϵ�еĶ��󽻻����н���ʹ��������Ҫ��ʾ���໥���ã��Ӷ�ʹ�������ɢ�����ҿ��Զ����ĸı�����֮��Ľ���
 * 
 * �н���ģʽ�����¼�������ɣ�
 * 
 * 1��Mediator�����н���
 * 		�����н��߽�ɫ����ͳһ�Ľӿڣ����ڸ�ͬ�½�ɫ֮���ͨ�š�
 * 2��Concrete Mediator�����н���
 * 		�����н���ͨ��Э����ͬ�½�ɫʵ��Э����Ϊ�������������������ͬ�½�ɫ��
 * 3��Colleagueͬ�½�ɫ
 * 		ÿһ��ͬ�½�ɫ��֪���н��߽�ɫ��������������ͬ�½�ɫͨ�ŵ�ʱ��һ��Ҫͨ���н��߽�ɫ��Э����ÿ��ͬ�������Ϊ��Ϊ���֣�һ���� 
 * ͬ�±������Ϊ������ı�������״̬�������Լ�����Ϊ�ȣ����ַ��������Է���Ϊ����������ͬ��������н���û���κε��������ڶ����Ǳ�
 * �������н��߲�����ɵ���Ϊ����������������
 * 
 * ʵ��Ӧ�ã�
 * MVC��ܣ����е�C(Controller)����һ���н���
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		//����һ���н���
		Mediator mediator = new ConcreteMediator();
		//����ͬ����
		ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
		
		//ͬ���������������
		colleague1.depMethod1();
		//ͬ��
		ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
		colleague2.depMethod2();
		
				
	}
}
