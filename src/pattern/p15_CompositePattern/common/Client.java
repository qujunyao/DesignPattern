package pattern.p15_CompositePattern.common;

/**
 * ���ģʽ��������
 * 
 * ���壺Ҳ�����ϳ�ģʽ�����߲���-����ģʽ���������£�
 * ��������ϳ����νṹ�Ա�ʾ������-���塱�Ĳ�νṹ��ʹ���û������������϶����ʹ�þ���һ���ԡ�
 * 
 * ���ģʽ�Ľ�ɫ��
 * 1��Component���󹹼���ɫ������μ���϶���Ĺ��з��������ԣ����Զ���һЩĬ�ϵ���Ϊ�����ԡ�
 * 2��LeafҶ�ӹ�����Ҷ�Ӷ���������Ҳû�������ķ�֧��Ҳ���Ǳ�������С��λ��
 * 3��Composite��֦��������֦�������������������֦����Ҷ�ӽ���γ�һ�����νṹ
 * 
 * 
 * �ŵ㣺
 * 1���߲�ģ����ü򵥣�һ�����νṹ�����н�㶼��Component���ֲ�������Ե�������˵û���κ�����
 * Ҳ����˵�߲�ģ�鲻�ع����Լ�������ǵ���������������Ͻṹ�����˸߲�ģ��Ĵ��롣
 * 2���ڵ��������ӣ�ʹ�������ģʽ��������һ����֦�ڵ������Ҷ�ڵ㶼�����ף�ֻҪ�ҵ����ĸ��ڵ��
 * �ǳ�������չ�����Ͽ���ԭ�򣬶��Ժ��ά���ǳ�������
 * 
 * ȱ�㣺
 * ��֦����Ҷ�Ķ���ֱ��ʹ����ʵ���࣬����������ԭ���ͻ�������˽ӿڵ�Ӱ�췶Χ��
 * 
 * ʹ�ó�����
 * 1��ά����չ�ֲ���-�����ϵ�ĳ����������²˵����ļ����ļ��й���
 * 2����һ���������ܹ�����������ģ����ܵĳ�����
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

	public static void display(Composite composite) {
		for (Component c : composite.getChildren()) {
			if (c instanceof Leaf) {// Ҷ�ӽ��
				c.doSomething();
			} else {// ��֦��㡤����
				display((Composite) c);
			}
		}
	}
}
