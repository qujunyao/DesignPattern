package pattern.P19_VisitorPattern.common;

/**
 * ����Ԫ��
 * @author Administrator
 *
 */
public class ConcreteElement1 extends Element {

	//����ҵ���߼�
	@Override
	public void doSomething() {
		System.out.println("Ԫ��1����ҵ���߼���...");
	}

	//�����ĸ������߷���
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
