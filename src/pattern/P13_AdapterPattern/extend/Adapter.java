package pattern.P13_AdapterPattern.extend;

/**
 * ��������ɫ
 * 
 * @author Administrator
 *
 */
public class Adapter implements Target{
	
	private Adaptee adaptee;
	
	public Adapter( Adaptee ada) {
		this.adaptee = ada;
	}

	//Դ��Adaptee�з���doSomething �����������ֱ��ί�ɼ���
	@Override
	public int request() {
		this.adaptee.doSomething();
		return 1;
	}

	// Դ��Adapteeû�з���doSomething2 ���������������Ҫ����˷���
	@Override
	public int request2() {
		//д��صĴ���
		return 0;
	}


}
