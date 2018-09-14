package pattern.P09_CommandPattern;

/**
 * ��������
 * 
 * @author Administrator
 *
 */
public class Invoker {
	// ����һ������
	private Command command;

	// ��������
	public void setCommand(Command command) {
		this.command = command;
	}

	// ִ������
	public void action() {
		this.command.execute();
	}

}
