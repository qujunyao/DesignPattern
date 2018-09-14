package pattern.P20_StatePattern;

/**
 * ����״̬��ɫ
 * 
 * @author Administrator
 *
 */
public abstract class State {

	// ����һ��������ɫ���ṩ�������
	protected Context context;

	// ���û�����ɫ
	public void setContext(Context context) {
		this.context = context;
	}

	// ��Ϊ1
	public abstract void handle1();

	// ��Ϊ2
	public abstract void handle2();

}
