package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.example.domain.Test;

@Mapper
public interface TestMapper {

	@Select("select * from test")
	List<Test> selectAll();
	
	List<Test> selectAllWithEmp();
	
	@Select("select * from test where id=#{id}")
	Test selectById(int id);

	@Insert("insert into test values (#{id}, #{mydate,typeHandler=org.apache.ibatis.type.TimeOnlyTypeHandler}, #{mytimestamp}, #{myblob}, #{myblob2})")
	@SelectKey(before=true, keyProperty="id", 
				statement="select test_seq.nextval from dual"
				, resultType=Integer.class)	
	int insert(Test Test);
	
	@Update("update test set mydate=#{id}, mytimestamp=#{mytimestamp} where id=#{id}")
	int updateById(Test Test);
	
	@Delete("delete from test where id=#{id}")
	int deleteById(int id);

}
