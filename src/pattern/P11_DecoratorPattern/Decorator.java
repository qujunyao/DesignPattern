package pattern.P11_DecoratorPattern;

/**
 * 抽象装饰类
 * 
 * @author Administrator
 *
 */
public abstract class Decorator extends Component {

	private Component component = null;

	// 通过构造函数传递被修饰者
	public Decorator(Component c) {
		this.component = c;
	}

	// 委托给被修饰者执行
	@Override
	public void operate() {
		this.component.operate();
	}

}
