package pattern.P19_VisitorPattern.extend;

/**
 * ���������
 * 
 * @author Administrator
 *
 */
public interface IVisitor {

	// ���Է�����Щ����

	public void visit(ConcreteElement1 concreteElement1);

	public void visit(ConcreteElement2 concreteElement2);

	// ͳ�ƹ���
	public int getTotal();

}
