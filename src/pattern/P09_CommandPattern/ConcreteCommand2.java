package pattern.P09_CommandPattern;

/**
 * �����������
 * 
 * @author Administrator
 *
 */
public class ConcreteCommand2 extends Command {

	//�����Լ���Ĭ�Ͻ�����
	public ConcreteCommand2() {
		super(new ConcreteReceiver2());
	}

	//�����µĽ�����
	public ConcreteCommand2(Receiver r) {
		super(r);
	}

	//ÿ��������������ʵ��һ������
	@Override
	public void execute() {
		super.receiver.doSomething();
	}

}
