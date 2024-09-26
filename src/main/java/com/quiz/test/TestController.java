package com.quiz.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

		@RequestMapping("/testquiz")
		@ResponseBody
		public String test2() {
			return "Hello world quiz";
		}
}
