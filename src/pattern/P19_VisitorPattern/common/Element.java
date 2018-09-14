package pattern.P19_VisitorPattern.common;

/**
 * 抽象元素类
 * 
 * 抽象元素有两类方法：一是本身的业务逻辑；另一个是允许哪一个访问者来访问。
 * @author Administrator
 *
 */
public abstract class Element {

	// 定义业务类型
	public abstract void doSomething();

	// 允许谁来访问
	public abstract void accept(IVisitor visitor);

}
