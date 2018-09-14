package pattern.P13_AdapterPattern.extend;

/**
 * 适配器角色
 * 
 * @author Administrator
 *
 */
public class Adapter implements Target{
	
	private Adaptee adaptee;
	
	public Adapter( Adaptee ada) {
		this.adaptee = ada;
	}

	//源类Adaptee有方法doSomething 因此适配器类直接委派即可
	@Override
	public int request() {
		this.adaptee.doSomething();
		return 1;
	}

	// 源类Adaptee没有方法doSomething2 因此由适配器类需要补充此方法
	@Override
	public int request2() {
		//写相关的代码
		return 0;
	}


}
