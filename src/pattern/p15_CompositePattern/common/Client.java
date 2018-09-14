package pattern.p15_CompositePattern.common;

/**
 * 组合模式：场景类
 * 
 * 定义：也叫做合成模式，或者部分-整体模式，定义如下：
 * 将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户单个对象和组合对象的使用具有一致性。
 * 
 * 组合模式的角色：
 * 1、Component抽象构件角色：定义参加组合对象的共有方法和属性，可以定义一些默认的行为和属性。
 * 2、Leaf叶子构件：叶子对象，其下再也没有其他的分支，也就是遍历的最小单位。
 * 3、Composite树枝构件：树枝对象，它的作用是组合树枝结点和叶子结点形成一个树形结构
 * 
 * 
 * 优点：
 * 1、高层模块调用简单：一颗树形结构的所有结点都是Component，局部和整体对调用者来说没有任何区别，
 * 也就是说高层模块不必关心自己处理的是单个对象还是整个组合结构，简化了高层模块的代码。
 * 2、节点自由增加：使用了组合模式后，想增加一个树枝节点或者树叶节点都很容易，只要找到他的父节点就
 * 非常容易扩展，符合开闭原则，对以后的维护非常有利。
 * 
 * 缺点：
 * 树枝和树叶的定义直接使用了实现类，与依赖倒置原则冲突，限制了接口的影响范围。
 * 
 * 使用场景：
 * 1、维护和展现部分-整体关系的场景，如树新菜单，文件和文件夹管理。
 * 2、从一个整体中能够独立出部分模块或功能的场景。
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

	public static void display(Composite composite) {
		for (Component c : composite.getChildren()) {
			if (c instanceof Leaf) {// 叶子结点
				c.doSomething();
			} else {// 树枝结点···
				display((Composite) c);
			}
		}
	}
}
