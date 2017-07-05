package cn.tedu.web;

import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
@Component
public class DemoInterceptorII implements Interceptor {

	public void destroy() {
		System.out.println("intercepterII销毁");

	}

	public void init() {
		System.out.println("intercepterII创建");

	}

	public String intercept(ActionInvocation act) throws Exception {
		System.out.println("intercepterII开始拦截");
		act.invoke();
		System.out.println("intercepterII结束拦截");
		return null;
	}

}
