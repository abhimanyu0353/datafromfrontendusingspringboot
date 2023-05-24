package com.firstbit.datafromfrontend.Datafromfrontend;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

	//@PostMapping("/receive")
	public String getRequestData(@RequestParam (name="data")String value) {
		System.out.println(value);
		return "Method called";
		
	}
	
	//for more than 1 value method will be likr]=e this
	@PostMapping("/receive")
	public String getRequestData(@RequestParam (name="data")String value,@RequestParam int age) {
		System.out.println(age);
		return "Method called";
		
	}
	
	public String getRequestDAta(SomeEntity obj) {
		System.out.println(obj.age);
		return "method called";
	}
	
	//but what if too much parameter come then create one entity class and give annotattion as
/*
 * if the name of local value and data coming from request both name are same then remove name parameter
 * @PostMapping("/receive")
	public String getRequestData(@RequestParam String data) {
		System.out.println(data);
		return "Method called";
		
	}

 * 
 * 
 * 
 */
}
