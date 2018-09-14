package pattern.P17_FacadePattern;

public class Facade {

	// 被委托的对象
	private ClassA a = new ClassA();
	private ClassB b = new ClassB();
	private ClassC c = new ClassC();

	// 提供给外部访问的方法
	public void methodA() {
		this.a.doSomeThingA();
	}

	public void methodB() {
		this.b.doSomeThingB();
	}

	public void methodC() {
		this.c.doSomeThingC();
	}

}
