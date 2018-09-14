package pattern.P19_VisitorPattern.extend;

/**
 * ����Ԫ��
 * 
 * @author Administrator
 *
 */
public class ConcreteElement1 extends Element {

	// private int num = new Random().nextInt(100);
	private int num = 10;

	public int getNum() {
		return num;
	}

	// ����ҵ���߼�
	@Override
	public void doSomething() {
		System.out.println("Ԫ��1����ҵ���߼���...");
	}

	// �����ĸ������߷���
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
