package pattern.P21_InterpreterPattern;

/**
 * 非终结表达式
 * 
 * @author Administrator
 *
 */
public class NonterminalExpression extends Expression {

	// 每个非终结表达式都会对其他表达式产生依赖
	public NonterminalExpression(Expression expression) {

	}

	@Override
	public Object Interpreter(Context c) {
		// 进行相关处理
		return null;
	}

}
