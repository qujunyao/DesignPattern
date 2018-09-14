package pattern.P18_MementoPattern.extend01;

/**
 * �����˽�ɫ
 * 
 * @author Administrator
 *
 */
public class Originator implements Cloneable {

	private Originator backup;
	//�ڲ�״̬
	private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	//����һ������¼
	public void createMemento() {
		this.backup = this.clone();
	}
	
	//�ָ�һ������¼
	public void restoreMemento() {
		this.setState(this.backup.getState());
	}

	//��¡��ǰ����
	@Override
	protected Originator clone()  {
		try {
			return (Originator) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
