package cn.tedu.web;

import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
@Component
public class DemoInterceptorI implements Interceptor {

	public void destroy() {
		System.out.println("intercepterI销毁");
	}

	public void init() {
		System.out.println("intercepterI创建");
	}

	public String intercept(ActionInvocation act) throws Exception {
		System.out.println("intercepterI开始拦截");
		act.invoke();
		System.out.println("intercepterI结束拦截");
		return null;
	}

}
