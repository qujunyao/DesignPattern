package pattern.P09_CommandPattern;

/**
 * 具体的命令类
 * 
 * @author Administrator
 *
 */
public class ConcreteCommand2 extends Command {

	//声明自己的默认接受者
	public ConcreteCommand2() {
		super(new ConcreteReceiver2());
	}

	//设置新的接受者
	public ConcreteCommand2(Receiver r) {
		super(r);
	}

	//每个具体的命令都必须实现一个命令
	@Override
	public void execute() {
		super.receiver.doSomething();
	}

}
