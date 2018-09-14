package pattern.P18_MementoPattern.extend02;

import java.util.HashMap;

/**
 * ����¼��ɫ
 * 
 * @author Administrator
 *
 */
public class Memento {

	// ����HashMap��Ϊ״̬
	private HashMap<String, Object> stateMap;

	// ����һ�����󣬽���һ�����ݡ�
	public Memento(HashMap<String, Object> map) {
		this.stateMap = map;
	}

	public HashMap<String, Object> getStateMap() {
		return stateMap;
	}

	public void setStateMap(HashMap<String, Object> stateMap) {
		this.stateMap = stateMap;
	}

}
