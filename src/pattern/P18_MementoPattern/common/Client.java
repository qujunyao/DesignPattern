package pattern.P18_MementoPattern.common;

/**
 * 备忘录模式：场景类
 * 
 * 定义：
 * 在不破坏封装性的情况下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样就可以将对象恢复到原先保存的状态。
 * 
 * 角色：
 * 1、Originator发起人角色
 * 记录当前时刻的内部状态，负责定义哪些属于备份范围的状态，负责创建和恢复备忘录数据。
 * 2、Memento备忘录角色
 * 负责存储Originator发起人对象的内部状态，在需要的时候提供发起人需要的内部状态。
 * 3、Caretaker
 * 对备忘录进行管理、保存和提供备忘录。
 * 
 * 适用场景
 * 1、需要保存和恢复数据的相关状态场景。
 * 2、提供一个可回滚的操作。
 * 3、需要监控的副本场景。
 * 4、数据库连接的事务管理就是备忘录模式。
 * 
 * 注意事项
 * 1、备忘录的生命周期
 * 备忘录创建出来就要在“最近”的代码中使用，要主动管理它的生命周期，建立就要使用，不使用就要立刻删除其引用，等待gc回收。
 * 2、备忘录的性能
 * 不要频繁建立备份的场景中使用备忘录模式（比如一个for循环中），原因有二：一是控制不了备忘录建立的对象数量，二是大对象
 * 的建立是消耗资源的，系统的性能需要考虑。
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		//定义发起人
		Originator originator = new Originator();
		//定义备忘录管理员
		Caretaker caretaker = new Caretaker();
		//创建一个备忘录
		caretaker.setMemento(originator.createMemento());
		//恢复一个备忘录
		originator.restoreMemento(caretaker.getMemento());
	}
}
