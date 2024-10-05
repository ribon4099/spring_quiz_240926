package com.quiz.lesson04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/lesson04/quiz01")
@Controller // HTML 경로일 때는 @ResponseBody가 없다
public class Lesson04Quiz01Controller {

	// 회원가입 화면
		// http://localhost/lesson04/ex01/add-user-view
		@RequestMapping(path = "/add-seller-view", method = RequestMethod.GET)
		public String addSellerView() {
			return "lesson04/addSeller"; // HTML의 경로
		}	
		
}