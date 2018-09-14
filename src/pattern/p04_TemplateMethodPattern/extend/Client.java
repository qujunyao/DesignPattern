package pattern.p04_TemplateMethodPattern.extend;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 模板模式：场景类
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		ConcreteClass1 class1 = new ConcreteClass1();
		ConcreteClass2 class2 = new ConcreteClass2();
		String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		if("0".equals(type)) {
			class1.setCan(false);
		}
		class1.templateMethod();
		class2.templateMethod();
		
	}
}
