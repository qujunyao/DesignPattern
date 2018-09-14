package pattern.P19_VisitorPattern.extend;

/**
 * 具体元素
 * 
 * @author Administrator
 *
 */
public class ConcreteElement1 extends Element {

	// private int num = new Random().nextInt(100);
	private int num = 10;

	public int getNum() {
		return num;
	}

	// 完善业务逻辑
	@Override
	public void doSomething() {
		System.out.println("元素1处理业务逻辑中...");
	}

	// 允许哪个访问者访问
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
