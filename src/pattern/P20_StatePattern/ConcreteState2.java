package pattern.P20_StatePattern;

/**
 * ����״̬��ɫ
 * 
 * @author Administrator
 *
 */
public class ConcreteState2 extends State {

	@SuppressWarnings("static-access")
	@Override
	public void handle1() {
		// ���õ�ǰ״̬Ϊstate1
		super.context.setCurrentState(context.STATE1);
		// ���ȵ�state1״̬����contextʵ��
		super.context.handle1();

	}

	@Override
	public void handle2() {
		// ��״̬�±��봦����߼�
		System.out.println("handle2����������...");
	}

}
