package pattern.P20_StatePattern;

/**
 * ������ɫ
 * 
 * ������ɫ��2�������ĵ�Լ����
 * 1����״̬���������ɾ�̬�������м���״̬������������̬������
 * 2��������ɫ����״̬�����ɫ��������Ϊ������ִ��ʹ��ί�з�ʽ��
 * 
 * @author Administrator
 *
 */
public class Context {

	// ����״̬
	public final static State STATE1 = new ConcreteState1();
	public final static State STATE2 = new ConcreteState2();

	// ��ǰ״̬
	private State currentState;

	// ��õ�ǰ״̬
	public State getCurrentState() {
		return currentState;
	}

	// ���õ�ǰ״̬
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
		// �л�״̬
		this.currentState.setContext(this);
	}

	// ��Ϊί��1
	public void handle1() {
		this.currentState.handle1();
	}

	// ��Ϊί��1
	public void handle2() {
		this.currentState.handle2();
	}

}
