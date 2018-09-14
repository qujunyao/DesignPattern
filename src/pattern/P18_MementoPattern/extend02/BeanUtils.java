package pattern.P18_MementoPattern.extend02;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {

	// ��bean���������Լ���ֵ���뵽hashmap�С�
	public static HashMap<String, Object> backupProp(Object bean) {
		HashMap<String, Object> result = new HashMap<>();
		try {
			// ���bean����
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			// �����������
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			// ������������
			for (PropertyDescriptor pro : descriptors) {
				// ��������
				String fieldName = pro.getName();
				// ��ȡ���Է���
				Method getter = pro.getReadMethod();
				// ��ȡ����ֵ
				Object fieldValue = getter.invoke(bean, new Object[] {});
				if (!fieldName.equalsIgnoreCase("class")) {
					result.put(fieldName, fieldValue);
				}
			}
		} catch (Exception e) {
			// �쳣����
		}
		return result;
	}

	// ��hashmap��ֵ���ص�bean��
	public static void restoreProp(Object bean, HashMap<String, Object> propMap) {
		try {
			// ���bean����
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			// �����������
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			// ������������
			for (PropertyDescriptor pro : descriptors) {
				// ��������
				String fieldName = pro.getName();
				// ����и��������
				if (propMap.containsKey(fieldName)) {
					// д���Եķ���
					Method setter = pro.getWriteMethod();
					setter.invoke(bean, new Object[] { propMap.get(fieldName) });
				}
			}
		} catch (Exception e) {
			// �쳣����
			System.out.println("shit");
			e.printStackTrace();
		}
	}

}
