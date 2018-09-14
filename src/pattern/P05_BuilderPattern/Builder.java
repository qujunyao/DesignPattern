package pattern.P05_BuilderPattern;

/**
 * 抽象建造类
 * 
 * @author Administrator
 *
 */
public abstract class Builder {

	// 设置产品的不同部分，以获得不同的产品
	public abstract void setPart();

	// 建造产品
	public abstract Product buildProduct();
}
