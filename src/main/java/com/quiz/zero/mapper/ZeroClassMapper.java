package com.quiz.zero.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.zero.domain.ZeroClass;

@Mapper
public interface ZeroClassMapper {

	// input: X
	// output: List<ZeroClass>
	public List<ZeroClass> selectZeroClassList();
}
