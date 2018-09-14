package pattern.P13_AdapterPattern.common;

/**
 * 适配器模式：场景类
 * 
 * 定义：将一个类的接口变成为客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的2个类能够在一起工作
 * 适配器模式又叫变压器模式，也叫包装模式。
 * 
 * 适配器模式的3个角色：
 * 1、Target目标角色：该角色定义把其他类转换成何种接口，也就是我们的期望接口。
 * 2、Adaptee源角色：你想把谁转换成目标角色，这个“谁”就是目标角色，他是已经存在的运行良好的类或对象，经过适配器角色
 * 的包装，它会成为一个崭新、靓丽的角色。
 * 3、Adapter适配器角色：适配器模式的核心角色，其他2个角色是已经存在的，而适配器角色是需要建立的，他的职责非常简单：
 * 通过继承或者是类关联的方式，把源角色转化为目标角色。
 * 
 * 优点：
 * 1、增加了类的透明性
 * 2、提高了类的复用度
 * 3、灵活性高
 * 
 * 适用场景：
 * 有动机修改一个已经投产中的接口时，就使用适配器模式。
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// 原有的业务逻辑
		Target target = new ConcreteTarget();
		target.request();

		// 现在增加了适配器角色后的逻辑
		Target target2 = new Adapter();
		target2.request();

	}

}
