package pattern.p15_CompositePattern.extend;

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
		component.setParent(this);
		this.arrayList.add(component);
	}

	public void remove(Component component) {
		this.arrayList.remove(component);
	}

	public ArrayList<Component> getChildren() {
		return this.arrayList;
	}
}
