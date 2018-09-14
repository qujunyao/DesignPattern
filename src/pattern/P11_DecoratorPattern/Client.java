package pattern.P11_DecoratorPattern;

/**
 * װ��ģʽ��������
 * 
 * װ��ģʽ���壺��̬�ĸ�һ���������һЩ�����ְ�𣬾����ӹ�����˵��װ��ģʽ����������������
 * 
 * ��Ҫ��Ϊ4����ɫ��
 * 1��Component��һ���ӿڻ����ǳ����࣬���Ƕ�����������ĵĶ���Ҳ������ԭʼ�Ķ���
 * 2��ConcreteComponent������ġ���ԭʼ��������Ľӿڻ��߳������ʵ�֣���Ҫװ�εľ�������
 * 3��Decorator����װ���࣬�����治һ���г���ķ������������������Ȼ��һ��private����ִ��Component���󹹼���
 * 3��ConcreteDecorator�Ǿ����װ���࣬��Ҫ������ġ���ԭʼ��������Ķ���װ�γ�����������
 * 
 * �ŵ㣺
 * 1��װ����ͱ�װ������Զ����ķ�չ���������໥��ϡ����仰˵��Component������֪��Decorator�࣬Decorator���Ǵ��ⲿ����չComponent��Ĺ��ܣ���DecoratorҲ����֪������Ĺ�����
 * 2��װ��ģʽ�Ǽ̳й�ϵ��һ����������������ǿ�װ����Decorator������װ�ζ�ɱ�㣬���صĶ�����Component��ʵ�ֵĻ���is-a�Ĺ�ϵ��
 * 3��װ��ģʽ���Զ�̬����չһ��ʵ����Ĺ��ܡ�
 * 
 * ȱ�㣺
 * ����װ���ǱȽϸ��ӵģ���Ҫ��������װ������������Ա㽵��ϵͳ�ĸ��Ӷȡ�
 * 
 * ʹ�ó�����
 * 1����Ҫ��չһ����Ĺ��ܣ����߸�һ�������Ӹ��ӹ��ܡ�
 * 2����Ҫ��̬�ĸ�һ���������ӹ��ܣ���Щ���ܿ����ٶ�̬�ĳ�����
 * 3����ҪΪһ�����ֵ�����и�װ���װ���ܡ�
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		//����һ������
		Component component = new ConcreteComponent();

		//��һ������
		component = new ConcreteDecorator1(component);

		//�ڶ�������
		component = new ConcreteDecorator2(component);

		//���κ�����
		component.operate();
	}
}
