package pattern.P19_VisitorPattern.common;

/**
 * ���������
 * @author Administrator
 *
 */
public interface IVisitor {

	//���Է�����Щ����
	
	public void visit(ConcreteElement1 concreteElement1);

	public void visit(ConcreteElement2 concreteElement2);
	
}
