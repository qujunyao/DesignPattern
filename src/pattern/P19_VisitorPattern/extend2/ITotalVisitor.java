package pattern.P19_VisitorPattern.extend2;

/**
 * 统计接口
 * 
 * @author Administrator
 *
 */
public interface ITotalVisitor extends IVisitor {

	// 统计
	public void getTotal();
}
