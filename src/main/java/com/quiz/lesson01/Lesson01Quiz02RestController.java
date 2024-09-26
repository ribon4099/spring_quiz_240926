package com.quiz.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/quiz02")
@RestController // @Contoller + @ ResponseBody 두가지 모두 포함

public class Lesson01Quiz02RestController {	

	// http://localhost:8080/lesson01/quiz02/1
	@RequestMapping("/1")
	@ResponseBody
	public List<Map<String, Object>> quiz02_1() {
		List<Map<String, Object>> listMovies = new ArrayList<>();
		
        Map<String, Object> movie1 = new HashMap<>();
        movie1.put("rate", 15);
        movie1.put("director", "봉준호");
        movie1.put("time", 131);
        movie1.put("title", "기생충");
        listMovies.add(movie1);
        
        Map<String, Object> movie2 = new HashMap<>();
        movie2.put("rate", 0);
        movie2.put("director", "로베르토 베니니");
        movie2.put("time", 116);
        movie2.put("title", "인생은 아름다워");
        listMovies.add(movie2);
        
        Map<String, Object> movie3 = new HashMap<>();
        movie3.put("rate", 12);
        movie3.put("director", "크리스토퍼 놀란");
        movie3.put("time", 147);
        movie3.put("title", "인셉션");
        listMovies.add(movie3);
        
        Map<String, Object> movie4 = new HashMap<>();
        movie4.put("rate", 19);
        movie4.put("director", "윤종빈");
        movie4.put("time", 133);
        movie4.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
        listMovies.add(movie4);
        
        Map<String, Object> movie5 = new HashMap<>();
        movie5.put("rate", 15);
        movie5.put("director", "프란시스 로렌스");
        movie5.put("time", 137);
        movie5.put("title", "헝거 게임");
        listMovies.add(movie5);
        
        
        return listMovies;
	}
	
	// http://localhost:8080/lesson01/quiz02/2
	@RequestMapping("/2")
	
	public Data quiz02_2() {
		Data data1 = new Data(); // java bean 이다.  (Spring bean은 절대 new 안함)
		data1.setTitle("안녕하세요 가입인사 드립니다");
		data1.setUser("marobiana");
		data1.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁드립니다. 활동 열심히 하겠습니다.");
		
		return data1; // object -> JSON String 이된다.
		

	}

	
}
