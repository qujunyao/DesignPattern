package pattern.P09_CommandPattern;

/**
 * 具体的命令类
 * 
 * @author Administrator
 *
 */
public class ConcreteCommand1 extends Command {

	//声明自己的默认接受者
	public ConcreteCommand1() {
		super(new ConcreteReceiver1());
	}

	//设置新的接受者
	public ConcreteCommand1(Receiver r) {
		super(r);
	}

	//每个具体的命令都必须实现一个命令
	@Override
	public void execute() {
		super.receiver.doSomething();
	}

}
