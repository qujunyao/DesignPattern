package pattern.P08_MediatorPattern;

/**
 * 抽象同事类
 * 
 * @author Administrator
 *
 */
public abstract class Colleague {

	protected Mediator mediator;

	public Colleague(Mediator m) {
		this.mediator = m;
	}
}
