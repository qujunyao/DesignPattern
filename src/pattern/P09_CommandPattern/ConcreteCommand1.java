package pattern.P09_CommandPattern;

/**
 * �����������
 * 
 * @author Administrator
 *
 */
public class ConcreteCommand1 extends Command {

	//�����Լ���Ĭ�Ͻ�����
	public ConcreteCommand1() {
		super(new ConcreteReceiver1());
	}

	//�����µĽ�����
	public ConcreteCommand1(Receiver r) {
		super(r);
	}

	//ÿ��������������ʵ��һ������
	@Override
	public void execute() {
		super.receiver.doSomething();
	}

}
