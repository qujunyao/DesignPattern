package pattern.p15_CompositePattern.common;

import java.util.ArrayList;

/**
 * Ê÷Ö¦¹¹¼þ
 * 
 * @author Administrator
 *
 */
public class Composite extends Component {

	private ArrayList<Component> arrayList = new ArrayList<>();

	public void add(Component component) {
		this.arrayList.add(component);
	}

	public void remove(Component component) {
		this.arrayList.remove(component);
	}

	public ArrayList<Component> getChildren() {
		return this.arrayList;
	}
}
