package pattern.P21_InterpreterPattern;

/**
 * ������ʽ
 * 
 * ������ʽ�������﷨���ϣ�Ҳ���﷨�����Ĺؼ���ÿ���﷨�������ָ���﷨��������
 * ����ͨ���ݹ���õķ�ʽ����������С���﷨��Ԫ���н�����ɡ�
 * 
 * @author Administrator
 *
 */
public abstract class Expression {

	// ������һ����������
	public abstract Object Interpreter(Context c);
}
