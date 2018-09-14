package pattern.P03_AbstractFactoryPattern;

/**
 * 抽象工厂模式 ，场景类
 * 
 * 抽象工厂的最大缺点就是扩展麻烦。
 * 
 * @author Administrator
 *
 */
public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//定义2个工厂
		AbstractCreator a = new Creator1();
		AbstractCreator b = new Creator2();
		//产生产品A1对象
		AbstractProductA A1 = a.createProductA();
		//产生产品A2对象
		AbstractProductA A2 = b.createProductA();
		//产生产品B1对象
		AbstractProductB B1 = a.createProductB();
		//产生产品B2对象
		AbstractProductB B2 = b.createProductB();
	}
}
