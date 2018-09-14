package pattern.p15_CompositePattern.extend;

import java.util.ArrayList;

/**
 * 树叶构件
 * 
 * @author Administrator
 *
 */
public class Leaf extends Component {

	@Override
	public void add(Component component) {
		//空实现，直接抛出一个“不支持请求”异常。
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(Component component) {
		//空实现
		throw new UnsupportedOperationException();

	}

	@Override
	public ArrayList<Component> getChildren() {
		//空实现
		throw new UnsupportedOperationException();
	}

	/*
	 * 可以复写父类的方法 public void doSomething() {
	 * 
	 * }
	 */

}
