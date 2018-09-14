package pattern.P05_BuilderPattern;

/**
 * ������
 * 
 * ������ģʽ��Ҳ��������ģʽ ͨ��������4����ɫ�� 
 * 
 * 1��Product��Ʒ�ࣺͨ����ʵ����ģ�巽��ģʽ��Ҳ����ģ�巽���ͻ���������
 * 2��Builder�������ߣ��淶��Ʒ�������һ����������ʵ�� 
 * 3��ConcreteBuilder���彨���ߣ�ʵ�ֳ����ඨ������з��������ҷ���һ��������˵Ķ��� 
 * 4��Director�����ࣺ����������ģ���˳��Ȼ�����Builder��ʼ���졣
 * 
 * һ���ģ��ģʽ���ʹ�á�
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		//����10����ƷA
		for (int i = 0; i < 10; i++) {
			director.getAProduct().doSomething();
		}
		//����20����ƷB
		for (int i = 0; i < 20; i++) {
			director.getBProduct().doSomething();
		}

	}
}
