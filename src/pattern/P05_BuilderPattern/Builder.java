package pattern.P05_BuilderPattern;

/**
 * ��������
 * 
 * @author Administrator
 *
 */
public abstract class Builder {

	// ���ò�Ʒ�Ĳ�ͬ���֣��Ի�ò�ͬ�Ĳ�Ʒ
	public abstract void setPart();

	// �����Ʒ
	public abstract Product buildProduct();
}
