package com.quiz.zero.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.zero.domain.ZeroClass;
import com.quiz.zero.mapper.ZeroClassMapper;

@Service
public class ZeroClassBO {
	
	@Autowired
	private ZeroClassMapper zeroClassMapper;
	
	public List<ZeroClass> getZeroClassList() {
		
		return zeroClassMapper.selectZeroClassList();
	}

}
