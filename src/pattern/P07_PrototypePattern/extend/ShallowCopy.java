package pattern.P07_PrototypePattern.extend;

import java.util.ArrayList;
import java.util.List;

/**
 * 浅拷贝
 * 
 * @author Administrator
 *
 */
public class ShallowCopy implements Cloneable {

	// 定义一个私有变量
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

	//赋值
	public void setValue(String e) {
		this.list.add(e);
	}

	//取值
	public List<String> getValue() {
		return this.list;
	}
	
}
