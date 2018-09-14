package pattern.P07_PrototypePattern.extend;

import java.util.ArrayList;
import java.util.List;

/**
 * ǳ����
 * 
 * @author Administrator
 *
 */
public class ShallowCopy implements Cloneable {

	// ����һ��˽�б���
	private List<String> list = new ArrayList<String>();

	@Override
	public ShallowCopy clone() {
		ShallowCopy thing = null;
		try {
			thing = (ShallowCopy) super.clone();
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
