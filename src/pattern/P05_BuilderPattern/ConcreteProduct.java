package pattern.P05_BuilderPattern;

/**
 * 具体建造者
 * 
 * @author Administrator
 *
 */
public class ConcreteProduct extends Builder {

	private Product product = new Product();

	/*
	 * 设置产品零件
	 */
	@Override
	public void setPart() {
		System.out.println("产品类内的逻辑处理");
	}

	/*
	 * 组建一个产品
	 */
	@Override
	public Product buildProduct() {
		return product;
	}

}
