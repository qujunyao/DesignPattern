package pattern.p15_CompositePattern.extend;

import java.util.ArrayList;

/**
 * ���󹹼�
 * 
 * @author Administrator
 *
 */
public abstract class Component {

	// ��������嶼���еĹ���
	public void doSomething() {
		// ҵ���߼�
	}

	public abstract void add(Component component);

	public abstract void remove(Component component);

	public abstract ArrayList<Component> getChildren();

	//���ڵ㣬�ú������(��Ҷ�ӽ����Ҹ��ڵ�)
	private Component parent = null;

	//�õ����ڵ�
	public Component getParent() {
		return parent;
	}

	//���ø��ڵ�
	public void setParent(Component parent) {
		this.parent = parent;
	}

}
