package com.quiz.zero;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/zero") // 메소드 위에 붙은 path보다 먼저 읽혀진다.
@Controller // Spring bean 등록

public class Lesson01Ex01Controller {

		// url: http://localhost:8080/zero/1
		// String을 브라우저에 출력
		@ResponseBody // 리턴되는 값은 Response Body에 넣어지고 HTML 응답
		@RequestMapping("/1")
		public String ex01_1() {
			return "<h2>문자열을 Response body에 보내는 예제</h2>";
		}
		
		// url: http://localhost:8080/zero/2
		// Map 출력 => JSON String 출력
		@RequestMapping("/2")
		public @ResponseBody Map<String, Object> ex01_2() {
			Map<String, Object> map = new HashMap<>();
			map.put("사과", 30);
			map.put("라즈베리", 222);
			map.put("바나나", 10);
			map.put("딸기", 16);
			
			// map을 리턴하면 JSON이 된다.
			// web starter에 jackson 라이브러리가 포함되어 있기 때문
			return map;
		}
	}	
