package pattern.P12_StrategyPattern.extend;

public enum Strategy {

	dosomething1(){
		public void doSomething() {
			System.out.println("具体策略1的运算法则");
		}
	},
	dosomething2(){
		public void doSomething() {
			System.out.println("具体策略2的运算法则");
		}
	};
	
	public abstract void doSomething();
	
}
