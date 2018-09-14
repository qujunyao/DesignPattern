package pattern.P19_VisitorPattern.extend;

/**
 * 抽象访问者
 * 
 * @author Administrator
 *
 */
public interface IVisitor {

	// 可以访问哪些对象

	public void visit(ConcreteElement1 concreteElement1);

	public void visit(ConcreteElement2 concreteElement2);

	// 统计功能
	public int getTotal();

}
