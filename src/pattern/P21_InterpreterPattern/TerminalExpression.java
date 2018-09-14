package pattern.P21_InterpreterPattern;

/**
 * 终结符表达式
 * 
 * @author Administrator
 *
 */
public class TerminalExpression extends Expression {

	// 通常终结符表达式只有一个，但是有多个对象
	@Override
	public Object Interpreter(Context c) {
		return null;
	}

}
