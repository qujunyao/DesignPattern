package pattern.p04_TemplateMethodPattern.common;

/**
 * 抽象模板类
 * 
 * @author Administrator
 *
 */
public abstract class AbstractClass {

	/*
	 * 基本方法
	 * 抽象模板中的方法尽量设计成为protected类型，符合迪米特发则，不需要暴露的属性和方法尽量不要设置为protected类型
	 * 实现类若非必要，尽量不要扩大父类中的访问权限。
	 */
	protected abstract void doSomething();
	
	//基本方法
	protected abstract void doAnything();
	
	/*
	 * 模板方法
	 * 为了防止恶意操作，一般模板方法都加上final关键字，不允许被复写
	 */
	public final void templateMethod() {
		/**
		 * 调用基本方法，完成相关的逻辑
		 */
		this.doAnything();
		this.doSomething();
	}
}
