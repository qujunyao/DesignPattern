package pattern.P19_VisitorPattern.extend2;

/**
 * ����Ԫ��
 * 
 * @author Administrator
 *
 */
public class ConcreteElement2 extends Element {

	// private int num = new Random().nextInt(100);
	private int num = 20;

	public int getNum() {
		return num;
	}

	// ����ҵ���߼�
	@Override
	public void doSomething() {
		System.out.println("Ԫ��2����ҵ���߼���...");
	}

	// �����ĸ������߷���
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
