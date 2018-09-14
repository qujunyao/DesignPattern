package pattern.P11_DecoratorPattern;

/**
 * 装饰模式：场景类
 * 
 * 装饰模式定义：动态的给一个对象添加一些额外的职责，就增加功能来说，装饰模式相比生成子类更加灵活。
 * 
 * 主要分为4个角色：
 * 1、Component是一个接口或者是抽象类，就是定义我们最核心的对象，也就是最原始的对象，
 * 2、ConcreteComponent是最核心、最原始、最基本的接口或者抽象类的实现，你要装饰的就是他。
 * 3、Decorator抽象装饰类，它里面不一定有抽象的方法，在它的属性里必然有一个private变量执行Component抽象构件。
 * 3、ConcreteDecorator是具体的装饰类，你要把最核心、最原始、最基本的东西装饰成其他东西。
 * 
 * 优点：
 * 1、装饰类和被装饰类可以独立的发展，而不会相互耦合。换句话说，Component类无需知道Decorator类，Decorator类是从外部来扩展Component类的功能，而Decorator也不用知道具体的构件。
 * 2、装饰模式是继承关系的一个替代方案，，我们看装饰类Decorator，不管装饰多杀层，返回的对象还是Component，实现的还是is-a的关系。
 * 3、装饰模式可以动态的扩展一个实现类的功能。
 * 
 * 缺点：
 * 多层的装饰是比较复杂的，需要尽量减少装饰类的数量，以便降低系统的复杂度。
 * 
 * 使用场景：
 * 1、需要扩展一个类的功能，或者给一个类增加附加功能。
 * 2、需要动态的给一个对象增加功能，这些功能可以再动态的撤销。
 * 3、需要为一批的兄弟类进行改装或加装功能。
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		//定义一个构件
		Component component = new ConcreteComponent();

		//第一次修饰
		component = new ConcreteDecorator1(component);

		//第二次修饰
		component = new ConcreteDecorator2(component);

		//修饰后运行
		component.operate();
	}
}
