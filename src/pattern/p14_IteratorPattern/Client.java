package pattern.p14_IteratorPattern;

/**
 * ������ģʽ��������
 * 
 * ���壺
 * ���ṩһ�ַ�������һ�����������и���Ԫ�أ����ֲ���Ҫ��¶�ö�����ڲ�ϸ�ڡ�Ŀǰ�������Ѿ���һ��û���ģʽ��������û���˻ᵥ��дһ��������
 * 
 * ʹ�ó�����
 * ������������Ҫ��������Ԫ�ء�
 * 
 * �������еĽ�ɫ��
 * 1��Iterator����������������������������ʺͱ���Ԫ�صĽӿڣ����һ��������й̶���3��������
 * first()��õ�һ��Ԫ�أ�next()������һ��Ԫ�أ�hasNext()�����Ƿ��ѷ��ʵ��ײ���
 * 2��ConcreteIterator�����������
 * �����������ɫҪʵ�ֵ������ӿڣ��������Ԫ�صı�����
 * 3��Aggregate��������
 * ������ɫ�����ṩ���������������ɫ�Ľӿڣ���Ȼ�ṩһ������createIterator()�����ķ�������java��һ����iterator()����
 * 4��ConcreteAggregate��������
 * ��������ʵ�������ӿڶ���ķ��������������ɵ������Ķ���
 * 
 * һ��Ӧ�ã���ǿforѭ��
 * 
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// ����һ������
		Aggregate agg = new ConcreteAggregate();

		// ���ɶ������ݷŽ�ȥ
		agg.add("abc");
		agg.add("AAA");
		agg.add("123");

		// ����һ��
		Iterator iterator = agg.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
