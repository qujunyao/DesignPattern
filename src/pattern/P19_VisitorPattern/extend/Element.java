package pattern.P19_VisitorPattern.extend;

/**
 * ����Ԫ����
 * 
 * ����Ԫ�������෽����һ�Ǳ����ҵ���߼�����һ����������һ�������������ʡ�
 * @author Administrator
 *
 */
public abstract class Element {

	// ����ҵ������
	public abstract void doSomething();

	// ����˭������
	public abstract void accept(IVisitor visitor);

}
