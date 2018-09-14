package pattern.P02_FactoryPattern.extend04;

import java.util.HashMap;
import java.util.Map;

/**
 * 延迟初始化：一个对象被使用完后，并不立即释放，工厂类保持其初始化状态，等待再次被使用。
 * 
 * 通过map变量产生一个缓存，对需要再次被重用的对象保留。
 * 
 * @author Administrator
 *
 */
public class ProductFactory  {
	
	private static final Map<String, Product> map = new HashMap<>();

	public synchronized static Product createProduct(String type) {
		Product product = null;
		//如果map中已经有这个对象，则直接取出来用
		if(map.containsKey(type)) {
			product = map.get(type);
		}else {
			if(type.equals("product1")) {
				product = new ConcreteProduct1();
			}else {
				product = new ConcreteProduct2();
			}
			//同时把对象放入到缓存容器中。
			map.put(type, product);
		}
		return product;
	}

}
