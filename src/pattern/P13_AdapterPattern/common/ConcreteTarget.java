package pattern.P13_AdapterPattern.common;

/**
 * Ŀ���ɫʵ����
 * 
 * @author Administrator
 *
 */
public class ConcreteTarget implements Target {

	@Override
	public void request() {
		System.out.println("if you need any help,please call me!");
	}

}
