package pattern.P06_ProxyPattern.extend04;

/**
 * ֪ͨ�ӿ�ʵ����
 * 
 * @author Administrator
 *
 */
public class BeforeAdvice implements IAdvice {

	@Override
	public void exec() {
		System.out.println("����ǰ��֪ͨ���ұ�ִ���ˡ�");
	}

}
