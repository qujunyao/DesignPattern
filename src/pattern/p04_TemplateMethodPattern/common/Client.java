package pattern.p04_TemplateMethodPattern.common;

/**
 * 模板模式：场景类
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		AbstractClass class1 = new ConcreteClass1();
		AbstractClass class2 = new ConcreteClass2();
		class1.templateMethod();
		class2.templateMethod();
		
	}
}
