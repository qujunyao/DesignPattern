package pattern.P19_VisitorPattern.extend;

/**
 * ������ģʽ��չ���ܣ�ͳ�ƣ� ��������
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		IVisitor visitor = new Visitor();
		for (int i = 0; i < 10; i++) {
			// ��ö���Ԫ��
			Element e = ObjectStruture.createElement();
			// ���ܷ����߷���
			e.accept(visitor);
		}
		System.out.println("ͳ��ֵΪ��"+visitor.getTotal());
	}
}
