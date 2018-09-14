package pattern.p15_CompositePattern.extend;

/**
 * ͸�������ģʽ��������
 * 
 * 
 * ͸��ģʽ�ǰ��������ʹ�õķ����ŵ��������У�����add��remove��getChildern�ȷ�������������Ҷ�Ӷ�������֦��������ͬ�Ľṹ��
 * ͨ���ж���getChildren�ķ���ֵȷ����Ҷ�ӽ�㻹����֦��㣬�������������������ʱ��������
 * 
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// ����һ�����ڵ�
		Composite root = new Composite();
		root.doSomething();
		// ����һ����֦���
		Composite branch = new Composite();
		// ����һ��Ҷ�ӽ��
		Leaf leaf = new Leaf();
		// �������
		root.add(branch);
		branch.add(leaf);
		// ��ӡ
		display(root);
	}

	public static void display(Component composite) {
		for (Component c : composite.getChildren()) {
			if (c instanceof Leaf) {// Ҷ�ӽ��
				c.doSomething();
			} else {// ��֦���
				//͸��ģʽ�£����ڽ���ǿ��ת���ˣ�����͸��ģʽ�ĺô���
				display(c);
			}
		}
	}
}
