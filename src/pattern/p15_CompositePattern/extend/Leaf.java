package pattern.p15_CompositePattern.extend;

import java.util.ArrayList;

/**
 * ��Ҷ����
 * 
 * @author Administrator
 *
 */
public class Leaf extends Component {

	@Override
	public void add(Component component) {
		//��ʵ�֣�ֱ���׳�һ������֧�������쳣��
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(Component component) {
		//��ʵ��
		throw new UnsupportedOperationException();

	}

	@Override
	public ArrayList<Component> getChildren() {
		//��ʵ��
		throw new UnsupportedOperationException();
	}

	/*
	 * ���Ը�д����ķ��� public void doSomething() {
	 * 
	 * }
	 */

}
