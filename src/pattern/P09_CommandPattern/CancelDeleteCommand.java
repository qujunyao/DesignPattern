package pattern.P09_CommandPattern;

/**
 * ³·ÏúÃüÁîÀà
 * 
 * @author Administrator
 *
 */
public class CancelDeleteCommand extends Command {

	public CancelDeleteCommand() {
		super(new ConcreteReceiver1());
	}

	public CancelDeleteCommand(Receiver r) {
		super(r);
	}

	@Override
	public void execute() {
		super.receiver.rollback();
	}

}
