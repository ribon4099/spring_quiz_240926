package com.quiz.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lesson01Quiz03Controller {
	// http://localhost:8080/lesson01/quiz03
	@RequestMapping("/lesson01/quiz03")
	public String quiz03() {
		return "lesson01/quiz03";
	}
}
