package pattern.P06_ProxyPattern.extend01;

/**
 * ��ʵ������
 * 
 * @author Administrator
 *
 */
public class RealSubject implements Subject {
	
	@SuppressWarnings("unused")
	private String name = "";
	
	/*
	 * ���캯������˭�ܴ������󣬲�ͬʱ��������
	 * 
	 * �ڹ��캯���У����ݽ���һ��RealSubject���󣬼��˭�ܴ�����ʵ�Ľ�ɫ����ǰ���������������ƣ���������������Proxy�ȵ�
	 * ����������չ��
	 */
	public RealSubject(Subject sub,String name) throws Exception{
		if(sub==null) {
			throw new Exception("���ܴ�����ʵ��ɫ");
		}else {
			this.name = name;
		}
	}

	// ʵ�ַ���
	@Override
	public void request() {
		System.out.println("ҵ���߼�����");
	}

}
