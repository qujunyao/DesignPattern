package pattern.P20_StatePattern;

/**
 * ����״̬��ɫ
 * 
 * @author Administrator
 *
 */
public class ConcreteState1 extends State {

	@Override
	public void handle1() {
		// ��״̬�±��봦����߼�
		System.out.println("handle1����������...");
	}

	@SuppressWarnings("static-access")
	@Override
	public void handle2() {
		// ���õ�ǰ״̬Ϊstate2
		super.context.setCurrentState(context.STATE2);
		// ���ȵ�state2״̬����contextʵ��
		super.context.handle2();

	}

}
