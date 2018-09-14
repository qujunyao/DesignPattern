package pattern.P10_ResponsibilityChainPattern;

/**
 * ����Ĵ�����
 * 
 * @author Administrator
 *
 */
public class ConcreteHandler1 extends Handler {

	private Level level;

	public ConcreteHandler1(int l) {
		if(level==null) {
			this.level = new Level();
		}
		this.level.setLevel(l);
	}

	// �Լ��Ĵ�����
	@Override
	protected Level getHandlerLevel() {
		return this.level;
	}

	// �����Լ��Ĵ����߼�
	@Override
	protected Response echo(Request request) {
		System.out.println("ConcreteHandler1���ڴ�����...");
		return null;
	}

}
