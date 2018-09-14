package pattern.P11_DecoratorPattern;

/**
 * �����װ����
 * 
 * @author Administrator
 *
 */
public class ConcreteDecorator2 extends Decorator {

	// ���屻������
	public ConcreteDecorator2(Component c) {
		super(c);
	}

	// �����Լ������η���
	private void method2() {
		System.out.println("method2����");
	}

	// ��д�����operation����
	@Override
	public void operate() {
		this.method2();
		super.operate();
	}

}
