package pattern.P09_CommandPattern;

/**
 * ����������
 * 
 * @author Administrator
 *
 */
public abstract class Command {

	//����һ�������ȫ�ֹ������
	protected final Receiver receiver;

	//ʵ������붨��һ��������
	public Command(Receiver r) {
		this.receiver = r;
	}

	//ÿ�������඼������һ��ִ������ķ���
	public abstract void execute();
}
