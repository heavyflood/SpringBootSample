package com.sicc.sample.controller.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
		
	@GetMapping("/")
    public  String index() {
        return "vue/index";
    }
}
