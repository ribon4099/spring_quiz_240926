package com.quiz.lesson03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.lesson03.domain.RealEstate;

@Mapper
public interface RealEstateMapper {

	// input: id(int)
	// output: RealEstate(DTO)
	public RealEstate selectRealEstateById(int id);
	
	// input: int(rentPrice)
	// output: List<RealEstate>
	public List<RealEstate> selectRealEstateListByRentPrice(int rentPrice222222222);
	
	// input: area(int), price(int)
	// output: List<RealEstate>
	public List<RealEstate> selectRealEstateListByAreaPrice(
			// 파라미터를 두개 이상 xml에 보낼 수 없다.
			// 하나의 맵으로 구성해야 하는데, @Param이 맵으로 만들어줌
			@Param("area") int area111111, 
			@Param("price") int price222222);
	
	// input: RealEstate
	// output: int(성공한 행의 개수)
	public int insertRealEstate(RealEstate realEstate);
	
	// input: 여러 파라미터
	// output: int
	public int insertRealEstateAsField(
			@Param("realtorId") int realtorId111,
			@Param("address") String address111, 
			@Param("area") int area11, 
			@Param("type") String type22,
			@Param("price") int price222, 
			@Param("rentPrice") Integer rentPrice333);
	
	// input: id, type, price
	// output: int
	public int updateRealEstateById(
			@Param("id") int id, 
			@Param("type") String type, 
			@Param("price") int price);
}