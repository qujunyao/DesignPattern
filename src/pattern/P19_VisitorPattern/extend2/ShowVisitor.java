package pattern.P19_VisitorPattern.extend2;

/**
 * 具体的展示接口访问者
 * 
 * @author Administrator
 *
 */
public class ShowVisitor implements IshowVisitor {

	private String info = "";

	// 访问concreteElement1的元素
	@Override
	public void visit(ConcreteElement1 concreteElement1) {
		concreteElement1.doSomething();
		this.info = this.info + "访问过concreteElement1的元素\n";
	}

	// 访问concreteElement2的元素
	@Override
	public void visit(ConcreteElement2 concreteElement2) {
		concreteElement2.doSomething();
		this.info = this.info + "访问过concreteElement2的元素\n";

	}

	@Override
	public void report() {
		System.out.println(this.info);
	}

}
