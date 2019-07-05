package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
	
	@RequestMapping("/hello")
	@ResponseBody
	String hello() {
		return "Hello Java Bootcamp!!!!!!!!!!!!!";
	}
	
	@RequestMapping("/test")
	@ResponseBody
	String hello2() {
		return "I have to pee";
	}
	

}