package pattern.P09_CommandPattern;

/**
 * 抽象接受者
 * 
 * @author Administrator
 *
 */
public abstract class Receiver {

	// 抽象接受者，定义每个接受者都必须完成任务
	public abstract void doSomething();
	
	//每个接受者都要对直接执行的任务可以回滚
	public void rollback() {
		//具体的回滚操作
		System.out.println("正在回退命令...");
	}
}
