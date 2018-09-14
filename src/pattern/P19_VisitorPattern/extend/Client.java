package pattern.P19_VisitorPattern.extend;

/**
 * 访问者模式扩展功能（统计） ：场景类
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		IVisitor visitor = new Visitor();
		for (int i = 0; i < 10; i++) {
			// 获得对象元素
			Element e = ObjectStruture.createElement();
			// 接受访问者访问
			e.accept(visitor);
		}
		System.out.println("统计值为："+visitor.getTotal());
	}
}
