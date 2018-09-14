package pattern.p14_IteratorPattern;

import java.util.Vector;

/**
 * 具体的容器
 * 
 * @author Administrator
 *
 */
public class ConcreteAggregate implements Aggregate {
	//容纳对象的容器
	@SuppressWarnings("rawtypes")
	private Vector v = new Vector<>();

	@SuppressWarnings("unchecked")
	@Override
	public void add(Object obj) {
		this.v.add(obj);
	}

	@Override
	public void remove(Object obj) {
		this.v.remove(obj);
	}

	@Override
	public Iterator iterator() {
		return new ConcreteIterator(this.v);
	}

}
