package pattern.P11_DecoratorPattern;

/**
 * ����װ����
 * 
 * @author Administrator
 *
 */
public abstract class Decorator extends Component {

	private Component component = null;

	// ͨ�����캯�����ݱ�������
	public Decorator(Component c) {
		this.component = c;
	}

	// ί�и���������ִ��
	@Override
	public void operate() {
		this.component.operate();
	}

}
