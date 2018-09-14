package pattern.P11_DecoratorPattern;

/**
 * �����װ����
 * 
 * @author Administrator
 *
 */
public class ConcreteDecorator1 extends Decorator {

	// ���屻������
	public ConcreteDecorator1(Component c) {
		super(c);
	}

	// �����Լ������η���
	private void method1() {
		System.out.println("method1����");
	}

	// ��д�����operation����
	@Override
	public void operate() {
		this.method1();
		super.operate();
	}

}
