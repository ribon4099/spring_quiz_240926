package com.quiz.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/quiz02t")
@RestController // @Contoller + @ ResponseBody 두가지 모두 포함
public class Lesson01Quiz02RestControllerT {
	
	// http://localhost:8080/lesson01/quiz02t/1
	@RequestMapping("/1")
	public List<Map<String, Object>> quiz02_1() {
		
		List<Map<String, Object>> list = new ArrayList<>();
		
		Map<String, Object> map = new HashMap<>();
		map.put("rate", 15);
        map.put("director", "봉준호");
        map.put("time", 131);
        map.put("title", "기생충");
        list.add(map);
        
        map = new HashMap<>();
        map.put("rate", 0);
        map.put("director", "로베르토 베니니");
        map.put("time", 116);
        map.put("title", "인생은 아름다워");
        list.add(map);
        
        map = new HashMap<>();
        map.put("rate", 12);
        map.put("director", "크리스토퍼 놀란");
        map.put("time", 147);
        map.put("title", "인셉션");
        list.add(map);
        
        return list;       
		
	}
	
	// http://localhost:8080/lesson01/quiz02/2
	@RequestMapping("/2")
	public List<Board> quiz02_2() {
		// @ResponseBody + return String => HttpMessageConverter => HTML로 내려준다
		// @ResponseBody + return 객체 => HttpMessageConverter => Jackson lib => JSON
		
		
		List<Board> list = new ArrayList<>();
		
		Board board = new Board();
		board.setTitle("안녕하세요 가입인사드립니다.");
		board.setUser("marobiana");
		board.setContent("안녕하세요 가입했어요~~ 잘 부탁가입인사드립니다.");
		list.add(board);
		
		board = new Board();
		board.setTitle("헐 대박");
		board.setUser("bada");
		board.setContent("오늘 목요일.");
		list.add(board);
		
		board = new Board();
		board.setTitle("까꿍");
		board.setUser("dorosi");
		board.setContent("정말 좋은 날.");
		list.add(board);
		
		
		return list; // JSON response body
		
	}
	
	// http://localhost:8080/lesson01/quiz02/3
	@RequestMapping("/3")
	public ResponseEntity<Board> quiz02t_3() {
		
		Board board = new Board();
		board.setTitle("안녕하세요 가입인사드립니다.");
		board.setUser("marobiana");
		board.setContent("안녕하세요 가입했어요~~ 잘 부탁가입인사드립니다.");
		
		return new ResponseEntity<>(board, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	

}
