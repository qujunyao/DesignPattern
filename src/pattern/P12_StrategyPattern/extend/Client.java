package pattern.P12_StrategyPattern.extend;

public class Client {

	public static void main(String[] args) {
		Strategy.dosomething1.doSomething();
		Strategy.dosomething2.doSomething();
	}
}
