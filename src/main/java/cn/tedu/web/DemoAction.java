package cn.tedu.web;

import org.springframework.stereotype.Controller;

@Controller

public class DemoAction {
	public String execute(){
		System.out.println("Demo");
		return "error";
	}
}
