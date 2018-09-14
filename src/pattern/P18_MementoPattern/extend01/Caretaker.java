package pattern.P18_MementoPattern.extend01;

/**
 * 备忘录管理员角色
 * 
 * @author Administrator
 *
 */
public class Caretaker {

	// 发起人角色
	private Originator originator;

	public Originator getOriginator() {
		return originator;
	}

	public void setOriginator(Originator originator) {
		this.originator = originator;
	}

}
