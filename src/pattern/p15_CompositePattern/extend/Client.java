package pattern.p15_CompositePattern.extend;

/**
 * 透明的组合模式：场景类
 * 
 * 
 * 透明模式是把用来组合使用的方法放到抽象类中，比如add，remove，getChildern等方法，这样不管叶子对象还是树枝对象都有相同的结构，
 * 通过判断是getChildren的返回值确认是叶子结点还是树枝结点，如果处理不当，会在运行时出现问题
 * 
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// 创建一个根节点
		Composite root = new Composite();
		root.doSomething();
		// 创建一个树枝结点
		Composite branch = new Composite();
		// 创建一个叶子结点
		Leaf leaf = new Leaf();
		// 组件整体
		root.add(branch);
		branch.add(leaf);
		// 打印
		display(root);
	}

	public static void display(Component composite) {
		for (Component c : composite.getChildren()) {
			if (c instanceof Leaf) {// 叶子结点
				c.doSomething();
			} else {// 树枝结点
				//透明模式下，不在进行强制转换了，这是透明模式的好处。
				display(c);
			}
		}
	}
}
