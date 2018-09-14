package pattern.P06_ProxyPattern.extend01;

/**
 * 场景类
 * 
 * 普通代理模式
 * 
 * 它的要求就是调用者只能访问代理角色，而不能访问真实角色。
 * 在该模式下调用者只知道代理角色，而不用知道真实的角色是谁，屏蔽了真实角色的变更对高层模块的影响。
 * 真实角色想怎么改就怎么改，对高层的模块没有任何的影响，只要你实现了接口所对应的方法，
 * 该模式非常适合对扩展性要求较高的场合。
 * 
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		//定义一个代理角色
		Proxy proxy = new Proxy("张三");
		//代理角色处理主题角色的业务逻辑
		proxy.request();
	}
}
