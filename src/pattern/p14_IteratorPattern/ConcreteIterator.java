package pattern.p14_IteratorPattern;

import java.util.Vector;

/**
 * 具体的迭代器
 * 
 * @author Administrator
 *
 */
public class ConcreteIterator implements Iterator {
	@SuppressWarnings("rawtypes")
	private Vector vector = new Vector();

	// 定义当前游标
	public int cursor = 0;

	@SuppressWarnings("rawtypes")
	public ConcreteIterator(Vector v) {
		this.vector = v;
	}

	// 返回下一个元素
	@Override
	public Object next() {
		Object result = null;
		if (this.hasNext()) {
			result = this.vector.get(this.cursor++);
		} else {
			result = null;
		}
		return result;
	}

	// 判断是否到达尾部
	@Override
	public boolean hasNext() {
		if (this.cursor == this.vector.size()) {
			return false;
		} else {
			return true;
		}
	}

	// 删除当前元素
	@Override
	public boolean remove() {
		this.vector.remove(this.cursor);
		return true;
	}

}
