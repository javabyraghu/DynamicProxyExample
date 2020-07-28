package in.nareshit.raghu;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * @author RAGHU
 */
public class ProcessProxyGenerator 
implements InvocationHandler
{


	private Object obj;

	public static Object newInstance(Object obj,Class<?>[] clz) {
		return java.lang.reflect.Proxy.newProxyInstance(
				obj.getClass().getClassLoader(),
				clz,
				new ProcessProxyGenerator(obj));
	}

	private ProcessProxyGenerator(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(
			Object proxy, 
			Method method, 
			Object[] args) 
					throws Throwable {

		Object result;
		try {
			result = method.invoke(obj, args);
		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		} catch (Exception e) {
			throw new RuntimeException(
					"unexpected invocation exception: " +
							e.getMessage());
		}
		return result;
	}

}
