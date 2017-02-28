package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.City;
import com.example.domain.Dept;
import com.example.domain.Emp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CityMapperTests {
	
	@Autowired
	CityMapper mapper;
	
	@Test
	public void test00_confirmMapper() {
		System.out.println("mapper=" + mapper);
	}
	
	@Test
	public void test01_selectAll() {
		List<City> list = mapper.selectAll();
		
		for (City city : list)
			System.out.println(city);
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
