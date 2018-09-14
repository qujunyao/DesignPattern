package pattern.P19_VisitorPattern.extend2;

/**
 * ������ģʽ��չ���ܣ�������ߣ� ��������
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// ͳ�ƽӿڵķ�����
		ITotalVisitor visitor = new TotalVisitor();
		// չʾ�ӿڵķ�����
		IshowVisitor visitor2 = new ShowVisitor();
		for (int i = 0; i < 10; i++) {
			// ��ö���Ԫ��
			Element e = ObjectStruture.createElement();
			// ���ܷ����߷���
			e.accept(visitor);
			e.accept(visitor2);
		}
		visitor.getTotal();
		visitor2.report();
	}
}
