package pattern.P18_MementoPattern.extend02;

/**
 * 多状态的备忘录模式：场景类
 * 
 * 为什么要使用HashMap，直接使用Originator对象的拷贝不是一个很好的方法吗?,可以这样做，这样做就破坏了发起人的通用性，
 * 在做恢复动作的时候需要对该对象进行对称赋值操作，也容易产生错误。
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		originator.setState1("中国");
		originator.setState2("强势");
		originator.setState3("繁荣");
		System.out.println("======初始化状态======\n"+originator);
		
		caretaker.setMemento(originator.createMemnto());
		
		originator.setState1("软件");
		originator.setState2("架构");
		originator.setState3("优秀");
		System.out.println("======修改后状态======\n"+originator);
		
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("======恢复后状态======\n"+originator);
		
	}
	
}
