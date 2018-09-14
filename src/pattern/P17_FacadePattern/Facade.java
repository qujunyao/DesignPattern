package pattern.P17_FacadePattern;

public class Facade {

	// ��ί�еĶ���
	private ClassA a = new ClassA();
	private ClassB b = new ClassB();
	private ClassC c = new ClassC();

	// �ṩ���ⲿ���ʵķ���
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
