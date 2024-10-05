package com.quiz.zero;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/zero")
@RestController  // @Controller + @ResponseBody

public class Lesson01Ex01RestController {

		// http://localhost:8080/zero/3
		@RequestMapping("/3")
		public String ex01_3() {
			return "<h3>@RestController를 사용해 String을 리턴한다.</h3>";
		}
		
		// http://localhost:8080/zero/4
		@RequestMapping("/4")
		public Map<String, String> ex01_4() {
			Map<String, String> map = new HashMap<>();
			map.put("aaa", "1111");
			map.put("bbb", "1111");
			map.put("ccc", "2222");
			return map; // map -> JSON
		}
		
		// http://localhost:8080/zero/5
		@RequestMapping("/5")
		public Data ex01_5() {
			Data data = new Data(); // 일반 java bean
			data.setId(100);
			data.setName("신보람");
			
			return data; // 일반 bean 객체도 JSON으로 변환됨
		}
		
		// http://localhost:8080/zero/6
		@RequestMapping("/6")
		public ResponseEntity<Data> ex01_6() {
			Data data = new Data();
			data.setId(1);
			data.setName("바다");
			
			return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
