package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Dept;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeptMapperTests {
	
	@Autowired
	DeptMapper mapper;
	
	@Test
	public void test00_confirmMapper() {
		System.out.println("mapper=" + mapper);
	}
	
	@Test
	public void test01_selectAll() {
		List<Dept> list = mapper.selectAll();
		
		for (Dept dept : list)
			System.out.println(dept);
	}
	
	@Test
	public void test01_selectAllWithEmp() {
		List<Dept> list = mapper.selectAllWithEmp();
		
		for (Dept dept : list)
			System.out.println(dept);
	}
	
	
	@Test
	public void test02_selectByDeptno() {
		
	}
	
	@Test
	public void test03_insert() {
		
	}
	
	@Test
	public void test04_updateByDeptno() {
		
	}
	
	@Test
	public void test05_deleteByDeptno() {
		
	}
	

}
