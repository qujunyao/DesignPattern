package pattern.P07_PrototypePattern.extend;

/**
 * ǳ������������
 * 
 * ǳ������Object���ṩ��clone����ֻ�ǿ���������������ڲ�����������ö���ȣ�
 * ��������������ָ��ԭ��������ڲ���ַ������һ�ֲ���ȫ�ķ�ʽ����ʵ��Ӧ���бȽ��ټ���
 * 
 * 
 * 
 * @author Administrator
 *
 */
public class ShallowClient {

	public static void main(String[] args) {
		ShallowCopy shallowCopy = new ShallowCopy();
		shallowCopy.setValue("����");
		ShallowCopy copy = shallowCopy.clone();
		copy.setValue("����");
		System.out.println(shallowCopy.getValue());
	}
}
