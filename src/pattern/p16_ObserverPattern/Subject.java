package pattern.p16_ObserverPattern;

import java.util.Vector;

/**
 * 被观察者
 * 
 * @author Administrator
 *
 */
public abstract class Subject {

	// 定义一个观察者数组
	private Vector<Observer> vector = new Vector<>();

	// 增加一个观察者
	public void addObserver(Observer o) {
		this.vector.add(o);
	}

	// 删除一个观察者
	public void deleteObserver(Observer o) {
		this.vector.remove(o);
	}

	// 通知所有观察者
	public void notifyObserver() {
		for (Observer observer : vector) {
			observer.update();
		}
	}
}
