package pattern.P18_MementoPattern.common;

/**
 * 备忘录管理员角色
 * 
 * @author Administrator
 *
 */
public class Caretaker {

	// 备忘录对象
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
