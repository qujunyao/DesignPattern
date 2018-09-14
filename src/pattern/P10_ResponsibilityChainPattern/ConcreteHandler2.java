package pattern.P10_ResponsibilityChainPattern;

/**
 * ����Ĵ�����
 * 
 * @author Administrator
 *
 */
public class ConcreteHandler2 extends Handler {

	private Level level;

	public ConcreteHandler2(int l) {
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
		System.out.println("ConcreteHandler2���ڴ�����...");
		return null;
	}

}
