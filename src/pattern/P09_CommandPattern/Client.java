package pattern.P09_CommandPattern;

/**
 * 命令模式：场景类
 * 
 * 
 * 命令模式是一个高内聚模式，其定义为：将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，
 * 可以提供命令的撤销和恢复功能。
 * 
 * 命令模式有3个角色：
 * 1、Receiver接受者角色：该角色就是干活儿的角色，命令被传到这里是应该被执行的。
 * 2、Command命令角色：需要执行的所有命令都在这里声明。
 * 3、Invoker负责人角色(调用者角色)：接受到命令，并执行命令。
 * 
 * 命令模式的优点：
 * 1、类间解耦：调用者角色和接受者角色之间没有任何依赖关系，调用者实现功能时只须调用Command抽象类的execute方法即可，不需要知道是哪个接受者执行。
 * 2、可扩展性：Command的子类可以非常容易的扩展，而调用者Invoker和高层的模块Client不产生严重的代码耦合。
 * 3、命令模式结合其他模式会更优秀：命令模式可以结合责任模式，实现命令族解析任务；结合模板方法模式，则可以减少Command子类的膨胀问题。
 * 
 * 命令模式的缺点：
 * Command子类容易膨胀。 
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		//首次声明负责人
		Invoker invoker = new Invoker();
		//定义一个发送给接受者的命令
		Command command = new ConcreteCommand1();
		//把命令交给负责人去执行
		invoker.setCommand(command);
		invoker.action();
		
		Command command2 = new CancelDeleteCommand();
		invoker.setCommand(command2);
		invoker.action();

	}
}
