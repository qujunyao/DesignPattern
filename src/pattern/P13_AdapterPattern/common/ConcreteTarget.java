package pattern.P13_AdapterPattern.common;

/**
 * 目标角色实现类
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
