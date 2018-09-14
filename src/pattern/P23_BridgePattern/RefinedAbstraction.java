package pattern.P23_BridgePattern;

/**
 * ������󻯽�ɫ
 * 
 * @author Administrator
 *
 */
public class RefinedAbstraction extends Abstraction {

	// ��д���캯��
	public RefinedAbstraction(Implementor imp) {
		super(imp);
	}

	// �����������Ϊ
	public void request() {
		/*
		 * ҵ����...
		 */
		super.request();
		super.getImplementor().doAnything();
	}

}
