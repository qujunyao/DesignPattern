package pattern.P07_PrototypePattern.extend;

import java.util.ArrayList;
import java.util.List;

/**
 * ���
 * 
 * @author Administrator
 *
 */
public class DeepCopy implements Cloneable {

	// ����һ��˽�б���
	private ArrayList<String> list = new ArrayList<String>();

	@SuppressWarnings("unchecked")
	@Override
	public DeepCopy clone() {
		DeepCopy thing = null;
		try {
			thing = (DeepCopy) super.clone();
			thing.list = (ArrayList<String>) this.list.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return thing;
	}

	//��ֵ
	public void setValue(String e) {
		this.list.add(e);
	}

	//ȡֵ
	public List<String> getValue() {
		return this.list;
	}
	
}
