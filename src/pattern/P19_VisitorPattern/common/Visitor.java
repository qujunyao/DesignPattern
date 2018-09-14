package pattern.P19_VisitorPattern.common;

/**
 * ����ķ�����
 * 
 * @author Administrator
 *
 */
public class Visitor implements IVisitor {

	// ����concreteElement1��Ԫ��
	@Override
	public void visit(ConcreteElement1 concreteElement1) {
		concreteElement1.doSomething();
	}

	// ����concreteElement2��Ԫ��
	@Override
	public void visit(ConcreteElement2 concreteElement2) {
		concreteElement2.doSomething();

	}

}
