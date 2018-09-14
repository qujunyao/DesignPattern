package pattern.P18_MementoPattern.extend03;

import java.util.HashMap;

/**
 * ����¼����Ա��ɫ
 * 
 * @author Administrator
 *
 */
public class Caretaker {
	
	//���ɱ���¼������
	private HashMap<String, Memento> memMap = new HashMap<>();
	
	public Memento getMemento(String idx) {
		return memMap.get(idx);
	}

	public void setMemento(String idx,Memento memento) {
		this.memMap.put(idx, memento);
	}

}
