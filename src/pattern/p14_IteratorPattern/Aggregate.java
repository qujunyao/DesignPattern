package pattern.p14_IteratorPattern;

/**
 * ��������
 * 
 * @author Administrator
 *
 */
public interface Aggregate {

	// Ԫ�����ӷ���
	public void add(Object obj);

	// Ԫ��ɾ������
	public void remove(Object obj);

	// �ɵ��������������е�Ԫ��
	public Iterator iterator();

}
