package com.quiz.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson02.domain.Store;
import com.quiz.lesson02.mapper.StoreMapper;

@Service  // Spring bean 등록
public class StoreBO {

	@Autowired  // DI (Dependency Injection): 의존성 주입
	private StoreMapper storeMapper;
	
	// input:X	
	// output:컨트롤러한테 준다. 요리결과 List<Store>
	
	public List<Store> getStoreList() {
		List<Store> storeList = storeMapper.selectStoreList(); // F3누르면메소드로 간다
		
		return storeList; // 컨트롤러한테 리턴
	}
	
}
