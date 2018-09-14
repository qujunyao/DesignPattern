package pattern.P10_ResponsibilityChainPattern;

/**
 * ������ģʽ��������
 * 
 * ������ģʽ���壺ʹ��������л��ᴦ�����󣬴Ӷ�����������ķ����ߺͽ�����֮�����Ϲ�ϵ������������һ���������������������ݸ�����ֱ���ж�������Ϊֹ
 * 
 * ��ʵ��Ӧ���У�һ�����һ����װ�������ģʽ���з�װ��Ҳ���Ǵ���Client�ֱ࣬�ӷ������е�һ�������ߣ������������ò���Ҫ�߲��ģ���ϵ���������˸߲��ģ
 * ��ĵ��ã�����ģ������ϣ��ṩϵͳ������ԡ�
 * 
 * �ŵ㣺
 * �ǳ��������е��ǣ�������ʹ���ֿ��������߿��Բ���֪����˭����ģ������߿��Բ���֪�������ȫò�����߽�����ϵͳ������ԡ�
 * 
 * ȱ�㣺
 * 1���������⣬ÿ�������Ǵ���ͷ��������β���ر������Ƚϳ���ʱ��������һ���ǳ�������⡣
 * 2��Э���ܲ����㣬�ر��������Ƚϳ������ڱȽ϶��ʱ�����ڲ��������Ƶݹ�ķ��������õ�ʱ���߼����ܱȽϸ��ӡ�
 * 
 * ע�����
 * ���нڵ�����Ҫ���ƣ�������ֳ������������һ�������ǣ���Handler������һ�����ڵ�������setNext�������ж��Ƿ��Ѿ���������ֵ�����������������������
 * ������ʶ���ƻ�ϵͳ���ܡ�
 * 
 * @author Administrator
 *
 */
public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// �������еĴ���ڵ�
		Handler handler1 = new ConcreteHandler1(1);
		Handler handler2 = new ConcreteHandler2(2);
		Handler handler3 = new ConcreteHandler3(3); 
		// �������еĽ׶�˳��1-->2-->3
		handler1.setNext(handler2);
		handler2.setNext(handler3);
		// handler3.setNext(handler1);
		// �ύ���󣬷��ؽ��
		Response response = handler1.handleMessage(new Request());
	}
}
