package pattern.P08_MediatorPattern;

/**
 * ����ͬ����
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
