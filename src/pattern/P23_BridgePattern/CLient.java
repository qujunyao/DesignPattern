package pattern.P23_BridgePattern;

/**
 * ����ģʽ��������
 * 
 * ���壺
 * Ҳ�����Ž�ģʽ���������ʵ�ֽ��ʹ�����߿��Զ����ı仯��
 * 
 * ��ɫ��
 * 1��Abstraction���󻯽�ɫ
 * ������Ҫְ���Ƕ�����ý�ɫ����Ϊ��ͬʱ����һ����ʵ�ֻ���ɫ�����ã��ý�ɫһ���ǳ����ࡣ
 * 2��Implementorʵ�ֻ���ɫ
 * ���ǽӿڻ��߳����࣬�����ɫ�������Ϊ�����ԡ�
 * 3��ConcreteImplementor����ʵ�ֻ���ɫ
 * ��ʵ�ֽӿڻ�����ඨ��ķ��������ԡ�
 * 
 * �ŵ㣺
 * 1���������ʵ����
 * Ҳ������ģʽ����Ҫ�ص㣬����ȫ��Ϊ�˽���̳е�ȱ�����������ģʽ���ڸ�ģʽ�£�ʵ�ֿ�
 * �Բ��ܳ����Լ���������ٰ���һ���̶��ĳ������ϡ�
 * 2���������չ����
 * 3��ʵ��ϸ�ڶԿͻ�͸��
 * �ͻ����ù���ϸ�ڵ�ʵ�֣� ���Ѿ��ɳ����ͨ���ۺϹ�ϵ����˷�װ��
 * 
 * ʹ�ó�����
 * 1����ϣ��������ʹ�õĳ���
 * ����̳в�ι��ȣ��޷���ϸ����ƿ����ȳ�������Ҫ����ʹ������ģʽ��
 * 2���ӿڻ��߳����಻�ȶ��ĳ���
 * ��֪���ӿڲ��ȶ�����ͨ��ʵ�ֻ�̳���ʵ��ҵ�������Ǿ��ǵò���ʧ��Ҳ�ǱȽ�ʧ�ܵ�������
 * 3��������Ҫ��ϸߵĳ���
 * ��ƵĿ�����Խϸ�������õĿ����Ծ�Խ�󣬶����ü̳����ܸ�������ƣ������ܳ���̫ϸ�Ŀ����ȡ�
 * 
 * ע�����
 * ����ģʽ�Ƿǳ��򵥵ģ�ʹ�ø�ģʽʱ��Ҫ������β�ֳ����ʵ�֣�������һ�漰�̳о�Ҫ����ʹ��
 * ��ģʽ������ģʽ����ͼ���ǶԱ仯�ķ�װ�����������ܱ仯�����ط�װ����ϸ����С���߼���Ԫ�У�
 * ���������ɢ������ڽ���ϵͳ���ʱ��������̳���N��ʱ�����Կ���ʹ������ģʽ��
 * 
 *	 
 * @author Administrator
 *
 */
public class CLient {

	public static void main(String[] args) {
		// ����һ��ʵ�ֻ���ɫ
		Implementor implementor = new ConcreteImplementor1();

		// ����һ�����󻯽�ɫ
		Abstraction abstraction = new RefinedAbstraction(implementor);

		// ִ������
		abstraction.request();
	}
}