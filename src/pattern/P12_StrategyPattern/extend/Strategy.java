package pattern.P12_StrategyPattern.extend;

public enum Strategy {

	dosomething1(){
		public void doSomething() {
			System.out.println("�������1�����㷨��");
		}
	},
	dosomething2(){
		public void doSomething() {
			System.out.println("�������2�����㷨��");
		}
	};
	
	public abstract void doSomething();
	
}
