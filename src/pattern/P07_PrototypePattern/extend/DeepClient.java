package pattern.P07_PrototypePattern.extend;

/**
 * �����������
 * 
 * ʹ��ԭ��ģʽʱ�����õĳ�Ա������������2�������Ų��ᱻ������һ����ĳ�Ա�����������Ƿ����ڱ���
 * ���Ǳ�����һ���ɱ�����ñ�����������һ��ԭʼԭ�ͻ򲻿ɱ����
 * 
 * @author Administrator
 *
 */
public class DeepClient {

	public static void main(String[] args) {
		DeepCopy DeepCopy = new DeepCopy();
		DeepCopy.setValue("����");
		DeepCopy copy = DeepCopy.clone();
		copy.setValue("����");
		System.out.println(DeepCopy.getValue());
	}
}
