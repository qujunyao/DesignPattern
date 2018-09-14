package pattern.P11_DecoratorPattern;

/**
 * 具体的装饰类
 * 
 * @author Administrator
 *
 */
public class ConcreteDecorator2 extends Decorator {

	// 定义被修饰者
	public ConcreteDecorator2(Component c) {
		super(c);
	}

	// 定义自己的修饰方法
	private void method2() {
		System.out.println("method2修饰");
	}

	// 重写父类的operation方法
	@Override
	public void operate() {
		this.method2();
		super.operate();
	}

}
