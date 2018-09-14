package pattern.p04_TemplateMethodPattern.common;

/**
 * 具体的模板类
 * 
 * @author Administrator
 *
 */
public class ConcreteClass2 extends AbstractClass {

	//实现基本方法
	@Override
	protected void doSomething() {
		System.out.println("模板类2业务逻辑处理1...");
	}

	@Override
	protected void doAnything() {
		System.out.println("模板类2业务逻辑处理2...");

	}

}
