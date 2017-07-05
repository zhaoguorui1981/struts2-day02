package cn.tedu.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;

@Controller
public class JsonAction {
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	private Map<String,Object> value=new HashMap();
	
	public Map<String, Object> getValue() {
		return value;
	}

	public void setValue(Map<String, Object> value) {
		this.value = value;
	}

	public String execute(){
		int[] i={1,2,3,4,5,6};
		value.put("name", "Tom");
		value.put("age", 100);
		value.put("dimension", i);
		id=100;
		message="Hello!";
		return "success";
	}
}
