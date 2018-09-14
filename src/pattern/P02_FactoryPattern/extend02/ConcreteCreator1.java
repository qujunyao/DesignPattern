package pattern.P02_FactoryPattern.extend02;

/**
 * 具体的工厂实现类：生产一个具体的对象
 * 
 * @author Administrator
 *
 */
public class ConcreteCreator1 extends Creator {

	@Override
	public Product createProduct() {
		return new ConcreteProduct1();
	}

}
