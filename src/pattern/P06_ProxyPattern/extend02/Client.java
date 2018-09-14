package pattern.P06_ProxyPattern.extend02;

import java.util.Date;

/**
 * 场景类
 * 
 * 强制代理模式
 * 
 * 强制代理模式的概念就是要从真实角色查找到代理角色，不允许访问真实角色，高层模块只要调用getSubject方法就可以访问
 * 真实角色的所有方法，它根本就不需要产生一个代理出来，代理的管理已经由真实角色自己完成。
 * 
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		// 定义一个真实角色
		Subject s1 = new RealSubject("张三");
		System.out.println("======================测试1=====================");
		System.out.println("开始时间：" + new Date());
		// 它要求你必须通过代理来访问，你想要直接访问他是不可能的。
		s1.request();
		System.out.println("结束时间：" + new Date());
		System.out.println();

		System.out.println("======================测试2=====================");
		// 定义一个真实角色
		Subject s2 = new RealSubject("李四");
		Subject s2proxy = new Proxy(s2);
		System.out.println("开始时间：" + new Date());
		// 不是指定代理。
		s2proxy.request();
		System.out.println("结束时间：" + new Date());
		System.out.println();

		System.out.println("======================测试3=====================");
		// 定义一个真实角色
		Subject s3 = new RealSubject("王五");
		Subject s3proxy = s3.getSubject();
		System.out.println("开始时间：" + new Date());
		// 指定的代理。
		s3proxy.request();
		System.out.println("结束时间：" + new Date());

	}
}
