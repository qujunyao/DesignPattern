package pattern.P05_BuilderPattern;

/**
 * 场景类
 * 
 * 建造者模式，也叫生成器模式 通常有如下4个角色： 
 * 
 * 1、Product产品类：通常是实现了模板方法模式，也就是模板方法和基本方法。
 * 2、Builder抽象建造者：规范产品的组件，一般是由子类实现 
 * 3、ConcreteBuilder具体建造者：实现抽象类定义的所有方法，并且返回一个组件好了的对象 
 * 4、Director导演类：负责安排已有模块的顺序，然后告诉Builder开始建造。
 * 
 * 一般和模板模式结合使用。
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		//建造10个产品A
		for (int i = 0; i < 10; i++) {
			director.getAProduct().doSomething();
		}
		//建造20个产品B
		for (int i = 0; i < 20; i++) {
			director.getBProduct().doSomething();
		}

	}
}
