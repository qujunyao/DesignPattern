package pattern.P12_StrategyPattern.common;

/**
 * ��װ��ɫ
 * 
 * @author Administrator
 *
 */
public class Context {

	//�������
	private Strategy strategy = null;
	
	//���캯�����þ���Ĳ���
	public Context(Strategy s) {
		this.strategy = s;
	}
	
	//��װ��Ĳ��Է���
	public void doAnything(){
		this.strategy.doSomething();
	}
}
