package pattern.p14_IteratorPattern;

/**
 * 迭代器模式：场景类
 * 
 * 定义：
 * 它提供一种方法访问一个容器对象中各个元素，而又不需要暴露该对象的内部细节。目前迭代器已经是一个没落的模式，基本上没有人会单独写一个迭代器
 * 
 * 使用场景：
 * 有容器对象需要遍历各个元素。
 * 
 * 迭代器中的角色：
 * 1、Iterator抽象迭代器：抽象迭代器负责定义访问和遍历元素的接口，而且基本上是有固定的3个方法：
 * first()获得第一个元素，next()访问下一个元素，hasNext()方法是否已访问到底部。
 * 2、ConcreteIterator具体迭代器：
 * 具体迭代器角色要实现迭代器接口，完成容器元素的遍历。
 * 3、Aggregate抽象容器
 * 容器角色负责提供创建具体迭代器角色的接口，必然提供一个类似createIterator()这样的方法，在java中一般是iterator()方法
 * 4、ConcreteAggregate具体容器
 * 具体容器实现容器接口定义的方法，创建出容纳迭代器的对象
 * 
 * 一般应用：增强for循环
 * 
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// 声明一个容器
		Aggregate agg = new ConcreteAggregate();

		// 生成对象数据放进去
		agg.add("abc");
		agg.add("AAA");
		agg.add("123");

		// 遍历一下
		Iterator iterator = agg.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
