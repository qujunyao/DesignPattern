package pattern.P08_MediatorPattern;

/**
 * 中介者模式：场景类
 * 
 * 定义：用一个中介者对象封装一系列的对象交互，中介者使各对象不需要显示的相互作用，从而使其耦合松散，而且可以独立的改变他们之间的交互
 * 
 * 中介者模式有以下几部分组成：
 * 
 * 1、Mediator抽象中介者
 * 		抽象中介者角色定义统一的接口，用于个同事角色之间的通信。
 * 2、Concrete Mediator具体中介者
 * 		具体中介者通过协调各同事角色实现协作行为，因此他必须依赖各个同事角色。
 * 3、Colleague同事角色
 * 		每一个同事角色都知道中介者角色，而且与其他的同事角色通信的时候，一定要通过中介者角色来协调。每个同事类的行为分为两种：一种是 
 * 同事本身的行为，比如改变对象本身的状态，处理自己的行为等，这种方法叫做自发行为，与其他的同事类或者中介者没有任何的依赖；第二种是必
 * 须依赖中介者才能完成的行为，叫做依赖方法。
 * 
 * 实际应用：
 * MVC框架，其中的C(Controller)就是一个中介者
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		//定义一个中介者
		Mediator mediator = new ConcreteMediator();
		//定义同事类
		ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
		
		//同事类调用依赖方法
		colleague1.depMethod1();
		//同理
		ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
		colleague2.depMethod2();
		
				
	}
}
