package pattern.P18_MementoPattern.extend03;

import java.util.HashMap;

/**
 * 备忘录管理员角色
 * 
 * @author Administrator
 *
 */
public class Caretaker {
	
	//容纳备忘录的容器
	private HashMap<String, Memento> memMap = new HashMap<>();
	
	public Memento getMemento(String idx) {
		return memMap.get(idx);
	}

	public void setMemento(String idx,Memento memento) {
		this.memMap.put(idx, memento);
	}

}
