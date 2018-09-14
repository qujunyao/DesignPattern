package pattern.P06_ProxyPattern.common;

/**
 * 场景类
 * 
 * 代理模式：也叫做委托模式
 * 主要有三个角色定义：
 * 1、Subject抽象主题角色：抽象主题角色可以是抽像类也可以是接口，是一个最普通的业务类型定义，无特殊要求。
 * 2、RealSubject具体主题角色：也被称为委托角色，被代理角色，是业务逻辑的具体执行者。
 * 3、Proxy代理主题角色：也被称为委托类或者代理类，它负责对真实角色的应用，把所有抽象主题类定义的方法限制委托给真实主题角色实现
 * 并且在真实主题角色处理完毕前后，做预处理和善后处理的工作。
 * 
 * 例如：
 * Struts2的Form元素映射就采用了代理模式。（动态代理）
 * 
 * Spring AOP。
 * 
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		//定义一个主题角色
		Subject s1 = new RealSubject();
		//定义一个代理角色
		Proxy proxy = new Proxy(s1);
		//代理角色处理主题角色的业务逻辑
		proxy.request();
	}
}
