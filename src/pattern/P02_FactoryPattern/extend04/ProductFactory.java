package pattern.P02_FactoryPattern.extend04;

import java.util.HashMap;
import java.util.Map;

/**
 * �ӳٳ�ʼ����һ������ʹ����󣬲��������ͷţ������ౣ�����ʼ��״̬���ȴ��ٴα�ʹ�á�
 * 
 * ͨ��map��������һ�����棬����Ҫ�ٴα����õĶ�������
 * 
 * @author Administrator
 *
 */
public class ProductFactory  {
	
	private static final Map<String, Product> map = new HashMap<>();

	public synchronized static Product createProduct(String type) {
		Product product = null;
		//���map���Ѿ������������ֱ��ȡ������
		if(map.containsKey(type)) {
			product = map.get(type);
		}else {
			if(type.equals("product1")) {
				product = new ConcreteProduct1();
			}else {
				product = new ConcreteProduct2();
			}
			//ͬʱ�Ѷ�����뵽���������С�
			map.put(type, product);
		}
		return product;
	}

}
