package pattern.P18_MementoPattern.common;

/**
 * ����¼��ɫ
 * 
 * @author Administrator
 *
 */
public class Memento {

	// �����˵��ڲ�̬
	private String state = "";

	// ���캯�����ݲ���
	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
