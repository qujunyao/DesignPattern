package pattern.P19_VisitorPattern.extend;

/**
 * ����ķ�����
 * 
 * @author Administrator
 *
 */
public class Visitor implements IVisitor {

	// �˷�ϵ��
	private final static int E1 = 5;
	private final static int E2 = 2;

	// e1ͳ��ֵ
	private int E1Total = 0;

	// e2ͳ��ֵ
	private int E2Total = 0;

	// ����concreteElement1��Ԫ��
	@Override
	public void visit(ConcreteElement1 concreteElement1) {
		concreteElement1.doSomething();
		getE1Total(concreteElement1.getNum());
	}

	// ����concreteElement2��Ԫ��
	@Override
	public void visit(ConcreteElement2 concreteElement2) {
		concreteElement2.doSomething();
		getE1Total(concreteElement2.getNum());

	}

	public void getE1Total(int num) {
		this.E1Total = this.E1Total + num * E1;
	}

	public void getE2Total(int num) {
		this.E2Total = this.E2Total + num * E2;
	}

	@Override
	public int getTotal() {
		return this.E1Total + this.E2Total;
	}

}
