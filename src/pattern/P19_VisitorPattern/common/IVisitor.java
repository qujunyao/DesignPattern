package pattern.P19_VisitorPattern.common;

/**
 * 抽象访问者
 * @author Administrator
 *
 */
public interface IVisitor {

	//可以访问哪些对象
	
	public void visit(ConcreteElement1 concreteElement1);

	public void visit(ConcreteElement2 concreteElement2);
	
}
