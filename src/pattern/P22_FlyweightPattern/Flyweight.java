package pattern.P22_FlyweightPattern;

/**
 * ������Ԫ��ɫ
 * 
 * @author Administrator
 *
 */
public abstract class Flyweight {

	// �ڲ�״̬
	private String intrinsic;

	// �ⲿ״̬
	// �ڳ��򿪷��У�ȷ��ֻ��Ҫһ�θ�ֵ������������Ϊfinal���ͣ����������޸ĵ����߼�����
	protected final String Extrinsic;

	// Ҫ����Ԫ��ɫ��������ⲿ״̬
	public Flyweight(String extrinsic) {
		this.Extrinsic = extrinsic;
	}

	// ����ҵ���߼�
	public abstract void operate();

	// �ڲ�״̬��get����
	public String getIntrinsic() {
		return intrinsic;
	}

	// �ڲ�״̬��set����
	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}

}
