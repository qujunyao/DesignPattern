package pattern.P22_FlyweightPattern;

/**
 * 抽象享元角色
 * 
 * @author Administrator
 *
 */
public abstract class Flyweight {

	// 内部状态
	private String intrinsic;

	// 外部状态
	// 在程序开发中，确认只需要一次赋值的属性则设置为final类型，避免无意修改导致逻辑混乱
	protected final String Extrinsic;

	// 要求享元角色必须接受外部状态
	public Flyweight(String extrinsic) {
		this.Extrinsic = extrinsic;
	}

	// 定义业务逻辑
	public abstract void operate();

	// 内部状态的get方法
	public String getIntrinsic() {
		return intrinsic;
	}

	// 内部状态的set方法
	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}

}
