package pattern.P13_AdapterPattern.extend;

/**
 * 目标角色实现类
 * 
 * @author Administrator
 *
 */
public class ConcreteTarget implements Target {

	@Override
	public int request() {
		System.out.println("if you need any help,please call me!---->1");
		return 1;
	}
	@Override
	public int request2() {
		System.out.println("if you need any help,please call me!---->2");
		return 2;
	}

}
