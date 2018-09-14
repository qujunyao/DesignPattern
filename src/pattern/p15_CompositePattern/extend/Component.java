package pattern.p15_CompositePattern.extend;

import java.util.ArrayList;

/**
 * 抽象构件
 * 
 * @author Administrator
 *
 */
public abstract class Component {

	// 个体和整体都具有的共享
	public void doSomething() {
		// 业务逻辑
	}

	public abstract void add(Component component);

	public abstract void remove(Component component);

	public abstract ArrayList<Component> getChildren();

	//父节点，用后序变量(从叶子结点查找父节点)
	private Component parent = null;

	//得到父节点
	public Component getParent() {
		return parent;
	}

	//设置父节点
	public void setParent(Component parent) {
		this.parent = parent;
	}

}
