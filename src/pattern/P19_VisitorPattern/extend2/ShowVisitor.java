package pattern.P19_VisitorPattern.extend2;

/**
 * �����չʾ�ӿڷ�����
 * 
 * @author Administrator
 *
 */
public class ShowVisitor implements IshowVisitor {

	private String info = "";

	// ����concreteElement1��Ԫ��
	@Override
	public void visit(ConcreteElement1 concreteElement1) {
		concreteElement1.doSomething();
		this.info = this.info + "���ʹ�concreteElement1��Ԫ��\n";
	}

	// ����concreteElement2��Ԫ��
	@Override
	public void visit(ConcreteElement2 concreteElement2) {
		concreteElement2.doSomething();
		this.info = this.info + "���ʹ�concreteElement2��Ԫ��\n";

	}

	@Override
	public void report() {
		System.out.println(this.info);
	}

}
