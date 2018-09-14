package pattern.p16_ObserverPattern;

import java.util.Vector;

/**
 * ���۲���
 * 
 * @author Administrator
 *
 */
public abstract class Subject {

	// ����һ���۲�������
	private Vector<Observer> vector = new Vector<>();

	// ����һ���۲���
	public void addObserver(Observer o) {
		this.vector.add(o);
	}

	// ɾ��һ���۲���
	public void deleteObserver(Observer o) {
		this.vector.remove(o);
	}

	// ֪ͨ���й۲���
	public void notifyObserver() {
		for (Observer observer : vector) {
			observer.update();
		}
	}
}
