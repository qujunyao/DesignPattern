package pattern.P13_AdapterPattern.extend;

/**
 * 对象适配器模式：场景类
 * 
 * 与类的适配器模式不同的是，对象的适配器模式不是使用继承关系连接到Adaptee类，而是使用委派关系连接到Adaptee类。
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// 原有的业务逻辑
		Target target = new ConcreteTarget();
		target.request();

		// 现在增加了适配器角色后的逻辑
		Adaptee adaptee = new Adaptee();
		Target target2 = new Adapter(adaptee);
		target2.request();

	}

}
