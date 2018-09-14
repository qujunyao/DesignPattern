package pattern.P09_CommandPattern;

/**
 * 负责人类
 * 
 * @author Administrator
 *
 */
public class Invoker {
	// 定义一个命令
	private Command command;

	// 接受命令
	public void setCommand(Command command) {
		this.command = command;
	}

	// 执行命令
	public void action() {
		this.command.execute();
	}

}
