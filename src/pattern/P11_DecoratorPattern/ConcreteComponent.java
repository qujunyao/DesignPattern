package pattern.P11_DecoratorPattern;

/**
 * 具体构件
 * 
 * @author Administrator
 *
 */
public class ConcreteComponent extends Component {

	// 具体实现
	@Override
	public void operate() {
		System.out.println("do something");
	}

}
