package com.quiz.lesson02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.lesson02.domain.Store;

@Mapper
public interface StoreMapper {

	// input: 헤스쉐프 BO한테 받아옴.
		// output: BO한테 돌려줌. List<UsedGoods>
		public List<Store> selectStoreList();
}
