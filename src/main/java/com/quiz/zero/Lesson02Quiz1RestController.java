package com.quiz.zero;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.zero.bo.ZeroClassBO;
import com.quiz.zero.domain.ZeroClass;

@RestController
public class Lesson02Quiz1RestController {

	@Autowired
	private ZeroClassBO zeroClassBO;
	
	// http://localhost:8080/zero/lesson02quiz1
	@RequestMapping("zero/lesson02quiz1")
	public List<ZeroClass> quiz1() {
		return zeroClassBO.getZeroClassList(); // list json => response
	}
}
