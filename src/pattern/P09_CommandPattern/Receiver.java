package pattern.P09_CommandPattern;

/**
 * ���������
 * 
 * @author Administrator
 *
 */
public abstract class Receiver {

	// ��������ߣ�����ÿ�������߶������������
	public abstract void doSomething();
	
	//ÿ�������߶�Ҫ��ֱ��ִ�е�������Իع�
	public void rollback() {
		//����Ļع�����
		System.out.println("���ڻ�������...");
	}
}
