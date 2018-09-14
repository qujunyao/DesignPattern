package pattern.P10_ResponsibilityChainPattern;

/**
 * ����Ĵ�����
 * 
 * @author Administrator
 *
 */
public class ConcreteHandler3 extends Handler {

	private Level level;

	public ConcreteHandler3(int l) {
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
		System.out.println("ConcreteHandler3���ڴ�����...");
		return null;
	}

}
