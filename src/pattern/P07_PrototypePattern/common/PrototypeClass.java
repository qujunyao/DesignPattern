package pattern.P07_PrototypePattern.common;

/**
 * ԭ��ģʽ��
 * 
 * ��ͨ��new�ؼ���������һ�����󣬶���ͨ����������ʵ�ֵ�ģʽ����ԭ��ģʽ��
 * 
 * �ŵ㣺
 * ԭ��ģʽ�����ڴ���������Ŀ�����Ҫ��ֱ��newһ���������ܺõĶ࣬�ر���Ҫ��һ��ѭ���ڲ�����������ʱ��ԭ��ģʽ���Ը��õ����������е㡣
 * 
 * ȱ�㣺
 * ͨ��ԭ��ģʽ�����Ķ��󣬲���ִ�й��캯�������ܹ��캯����Լ����
 * 
 * ʹ��ԭ��ģʽʱ����ĳ�Ա�����ϲ�Ҫ����final�ؼ��֡�
 * 
 * @author Administrator
 *
 */
public class PrototypeClass implements Cloneable {

	@Override
	public PrototypeClass clone() {
		PrototypeClass prototypeClass = null;
		try {
			prototypeClass = (PrototypeClass) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototypeClass;
	}
}
