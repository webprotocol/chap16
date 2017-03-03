package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.domain.City;
import com.example.domain.Country;

@Mapper
public interface CountryMapper {

	@Select("select * from country")
	List<Country> selectAll();
	
	List<Country> selectAllWithCity();
	
	@Select("select * from country where code=#{code}")
	Country selectByCode(String code);
	
	
//
//	@Insert("insert into emp values (#{Empno}, #{dname}, #{loc}")
//	int insert(Emp emp);
//	
//	@Update("update emp set dname=#{dname}, loc=#{loc} where Empno=#{Empno}")
//	int updateByEmpno(Emp Emp);
//	
//	@Delete("delete from Emp where Empno=#{Empno}")
//	int deleteByEmpno(int Empno);

}
