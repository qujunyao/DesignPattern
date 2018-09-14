package pattern.P06_ProxyPattern.extend01;

/**
 * 真实主题类
 * 
 * @author Administrator
 *
 */
public class RealSubject implements Subject {
	
	@SuppressWarnings("unused")
	private String name = "";
	
	/*
	 * 构造函数限制谁能创建对象，并同时传递名称
	 * 
	 * 在构造函数中，传递进来一个RealSubject对象，检查谁能创建真实的角色，当前还可以有其他限制，比如类名必须是Proxy等等
	 * 可以自行扩展。
	 */
	public RealSubject(Subject sub,String name) throws Exception{
		if(sub==null) {
			throw new Exception("不能创建真实角色");
		}else {
			this.name = name;
		}
	}

	// 实现方法
	@Override
	public void request() {
		System.out.println("业务逻辑处理");
	}

}
