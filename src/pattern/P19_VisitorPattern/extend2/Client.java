package pattern.P19_VisitorPattern.extend2;

/**
 * 访问者模式扩展功能（多访问者） ：场景类
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// 统计接口的访问者
		ITotalVisitor visitor = new TotalVisitor();
		// 展示接口的访问者
		IshowVisitor visitor2 = new ShowVisitor();
		for (int i = 0; i < 10; i++) {
			// 获得对象元素
			Element e = ObjectStruture.createElement();
			// 接受访问者访问
			e.accept(visitor);
			e.accept(visitor2);
		}
		visitor.getTotal();
		visitor2.report();
	}
}
