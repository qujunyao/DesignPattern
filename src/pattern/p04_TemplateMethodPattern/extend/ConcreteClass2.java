package pattern.p04_TemplateMethodPattern.extend;

/**
 * �����ģ����
 * 
 * @author Administrator
 *
 */
public class ConcreteClass2 extends AbstractClass {

	//ʵ�ֻ�������
	@Override
	protected void doSomething() {
		System.out.println("ģ����2ҵ���߼�����1...");
	}

	@Override
	protected void doAnything() {
		System.out.println("ģ����2ҵ���߼�����2...");

	}
	
	@Override
	protected boolean canDoSomething() {
		return false;
	}

}
