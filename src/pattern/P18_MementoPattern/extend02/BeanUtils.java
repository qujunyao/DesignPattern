package pattern.P18_MementoPattern.extend02;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {

	// 把bean的所有属性及数值放入到hashmap中。
	public static HashMap<String, Object> backupProp(Object bean) {
		HashMap<String, Object> result = new HashMap<>();
		try {
			// 获得bean描述
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			// 获得属性描述
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			// 遍历所有属性
			for (PropertyDescriptor pro : descriptors) {
				// 属性名称
				String fieldName = pro.getName();
				// 读取属性方法
				Method getter = pro.getReadMethod();
				// 读取属性值
				Object fieldValue = getter.invoke(bean, new Object[] {});
				if (!fieldName.equalsIgnoreCase("class")) {
					result.put(fieldName, fieldValue);
				}
			}
		} catch (Exception e) {
			// 异常处理
		}
		return result;
	}

	// 把hashmap的值返回到bean中
	public static void restoreProp(Object bean, HashMap<String, Object> propMap) {
		try {
			// 获得bean描述
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			// 获得属性描述
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			// 遍历所有属性
			for (PropertyDescriptor pro : descriptors) {
				// 属性名称
				String fieldName = pro.getName();
				// 如果有个这个属性
				if (propMap.containsKey(fieldName)) {
					// 写属性的方法
					Method setter = pro.getWriteMethod();
					setter.invoke(bean, new Object[] { propMap.get(fieldName) });
				}
			}
		} catch (Exception e) {
			// 异常处理
			System.out.println("shit");
			e.printStackTrace();
		}
	}

}
