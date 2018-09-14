package pattern.P10_ResponsibilityChainPattern;

/**
 * 责任链模式：场景类
 * 
 * 责任链模式定义：使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关系，将对象连成一条链，并沿着这条链传递该请求，直到有对象处理他为止
 * 
 * 在实际应用中，一般会有一个封装类对责任模式进行封装，也就是代替Client类，直接返回链中第一个处理者，具体链的设置不需要高层次模块关系，这样简化了高层次模
 * 块的调用，减少模块间的耦合，提供系统的灵活性。
 * 
 * 优点：
 * 非常显著的有点是，将请求和处理分开，请求者可以不用知道是谁处理的，处理者可以不用知道请求的全貌，两者解耦，提高系统的灵活性。
 * 
 * 缺点：
 * 1、性能问题，每个请求都是从链头遍历到链尾，特别是链比较长的时候，性能是一个非常大的问题。
 * 2、协调很不方便，特别是链条比较长，环节比较多的时候，由于采用了类似递归的方法，调用的时候逻辑可能比较复杂。
 * 
 * 注意事项：
 * 链中节点数需要控制，避免出现超长链的情况，一般做法是，在Handler中设置一个最大节点数，在setNext方法中判断是否已经超过其阈值，超过则不允许改链建立，避
 * 免无意识的破坏系统性能。
 * 
 * @author Administrator
 *
 */
public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 声明所有的处理节点
		Handler handler1 = new ConcreteHandler1(1);
		Handler handler2 = new ConcreteHandler2(2);
		Handler handler3 = new ConcreteHandler3(3); 
		// 设置链中的阶段顺序1-->2-->3
		handler1.setNext(handler2);
		handler2.setNext(handler3);
		// handler3.setNext(handler1);
		// 提交请求，返回结果
		Response response = handler1.handleMessage(new Request());
	}
}
