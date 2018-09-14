package pattern.p04_TemplateMethodPattern.common;

/**
 * ����ģ����
 * 
 * @author Administrator
 *
 */
public abstract class AbstractClass {

	/*
	 * ��������
	 * ����ģ���еķ���������Ƴ�Ϊprotected���ͣ����ϵ����ط��򣬲���Ҫ��¶�����Ժͷ���������Ҫ����Ϊprotected����
	 * ʵ�������Ǳ�Ҫ��������Ҫ�������еķ���Ȩ�ޡ�
	 */
	protected abstract void doSomething();
	
	//��������
	protected abstract void doAnything();
	
	/*
	 * ģ�巽��
	 * Ϊ�˷�ֹ���������һ��ģ�巽��������final�ؼ��֣���������д
	 */
	public final void templateMethod() {
		/**
		 * ���û��������������ص��߼�
		 */
		this.doAnything();
		this.doSomething();
	}
}
