package pattern.p14_IteratorPattern;

/**
 * 抽象容器
 * 
 * @author Administrator
 *
 */
public interface Aggregate {

	// 元素增加方法
	public void add(Object obj);

	// 元素删除方法
	public void remove(Object obj);

	// 由迭代器来遍历所有的元素
	public Iterator iterator();

}
