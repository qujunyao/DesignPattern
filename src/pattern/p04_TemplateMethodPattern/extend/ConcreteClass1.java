package pattern.p04_TemplateMethodPattern.extend;

/**
 * �����ģ����
 * 
 * @author Administrator
 *
 */
public class ConcreteClass1 extends AbstractClass {

	private boolean can = true;

	// ʵ�ֻ�������
	@Override
	protected void doSomething() {
		System.out.println("ģ����1ҵ���߼�����1...");
	}

	@Override
	protected void doAnything() {
		System.out.println("ģ����1ҵ���߼�����2...");

	}

	@Override
	protected boolean canDoSomething() {
		return can;
	}

	public void setCan(boolean can) {
		this.can = can;
	}

}
