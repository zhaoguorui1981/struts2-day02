package cn.tedu.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import cn.tedu.service.DemoService;

@Controller
public class HelloAction {
	@Resource
	private DemoService service;
	public String execute(){
		service.hello();
		System.out.println("Hello World");
		return "success";
	}
}
