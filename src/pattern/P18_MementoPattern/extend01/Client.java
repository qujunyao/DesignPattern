package pattern.P18_MementoPattern.extend01;

/**
 * clone发方式的备忘录模式：场景类
 * 
 * 发起人角色融合了发起人角色和备忘录角色，具有双重功效，程序精简，高层模块的依赖减少。
 * clone方式的备忘录模式，可以使用在比较 简单的场景或者比较单一的场景，尽量不要与其他的对象产生严重的耦合关系
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// 定义发起人
		Originator originator = new Originator();
		// 建立初始状态
		originator.setState("初始状态...");
		System.out.println("初始状态是:" + originator.getState());
		// 建立备份
		originator.createMemento();
		// 修改状态
		originator.setState("修改后的状态...");
		System.out.println("修改后的状态是:" + originator.getState());
		// 恢复还原
		originator.restoreMemento();
		System.out.println("恢复后的状态是:" + originator.getState());
	}
}
