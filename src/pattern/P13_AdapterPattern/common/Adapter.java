package pattern.P13_AdapterPattern.common;

/**
 * ��������ɫ
 * 
 * @author Administrator
 *
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		super.doSomething();
	}

}
