package pattern.P07_PrototypePattern.extend;

import java.util.ArrayList;
import java.util.List;

/**
 * 深拷贝
 * 
 * @author Administrator
 *
 */
public class DeepCopy implements Cloneable {

	// 定义一个私有变量
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

	//赋值
	public void setValue(String e) {
		this.list.add(e);
	}

	//取值
	public List<String> getValue() {
		return this.list;
	}
	
}
