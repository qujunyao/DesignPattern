package pattern.p14_IteratorPattern;

import java.util.Vector;

/**
 * ����ĵ�����
 * 
 * @author Administrator
 *
 */
public class ConcreteIterator implements Iterator {
	@SuppressWarnings("rawtypes")
	private Vector vector = new Vector();

	// ���嵱ǰ�α�
	public int cursor = 0;

	@SuppressWarnings("rawtypes")
	public ConcreteIterator(Vector v) {
		this.vector = v;
	}

	// ������һ��Ԫ��
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

	// �ж��Ƿ񵽴�β��
	@Override
	public boolean hasNext() {
		if (this.cursor == this.vector.size()) {
			return false;
		} else {
			return true;
		}
	}

	// ɾ����ǰԪ��
	@Override
	public boolean remove() {
		this.vector.remove(this.cursor);
		return true;
	}

}
