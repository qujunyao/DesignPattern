package pattern.P23_BridgePattern;

/**
 * ���󻯽�ɫ
 * 
 * @author Administrator
 *
 */
public abstract class Abstraction {

	// �����ʵ�ֻ���ɫ������
	private Implementor implementor;

	// Լ���������ʵ�ָù��캯��
	public Abstraction(Implementor imp) {
		this.implementor = imp;
	}

	// �������Ϊ������
	public void request() {
		this.implementor.doSomething();
		this.implementor.doAnything();
	}

	// ���ʵ�ֻ���ɫ
	public Implementor getImplementor() {
		return implementor;
	}

}
