package pattern.P18_MementoPattern.extend03;

/**
 * 多备份的备忘录模式：场景类
 * 
 * 可以恢复到指定备份，需要注意的是，内存溢出问题，该备份一旦产生就装入内存，没有任何销毁的意向，这是非常危险的。
 * 因此，在系统设计时，要严格限定备忘录的创建，建议增加map的上限，否则系统出现内存溢出的情况。
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
		//创建第一个备忘录
		caretaker.setMemento("001",originator.createMemnto());
		
		originator.setState1("风云");
		originator.setState2("平定");
		originator.setState3("天下");
		System.out.println("======修改状态======\n"+originator);
		//创建第二个备忘录
		caretaker.setMemento("002",originator.createMemnto());
		
		originator.setState1("软件");
		originator.setState2("架构");
		originator.setState3("优秀");
		System.out.println("======修改后状态======\n"+originator);
		
		//恢复指定的备忘录
		originator.restoreMemento(caretaker.getMemento("002"));
		System.out.println("======恢复后状态======\n"+originator);
		
	}
	
}
