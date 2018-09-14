package pattern.P19_VisitorPattern.common;

/**
 * 具体的访问者
 * 
 * @author Administrator
 *
 */
public class Visitor implements IVisitor {

	// 访问concreteElement1的元素
	@Override
	public void visit(ConcreteElement1 concreteElement1) {
		concreteElement1.doSomething();
	}

	// 访问concreteElement2的元素
	@Override
	public void visit(ConcreteElement2 concreteElement2) {
		concreteElement2.doSomething();

	}

}
