package com.example.mapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.FileCopyUtils;

import com.example.domain.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMapperTests {
	
	@Autowired
	TestMapper mapper;
	
	@org.junit.Test
	public void test00_confirmMapper() {
		System.out.println("mapper=" + mapper);
	}
	
	@org.junit.Test
	public void test01_selectAll() {
		List<Test> list = mapper.selectAll();
		
		for (Test test : list)
			System.out.println(test);
	}
	
	@org.junit.Test
	public void test01_selectAllWithEmp() {
		List<Test> list = mapper.selectAllWithEmp();
		
		for (Test dept : list)
			System.out.println(dept);
	}
	
	
	@org.junit.Test
	public void test02_selectById() throws IOException {
		Test t = mapper.selectById(20);
		System.out.println(t);
		
		FileCopyUtils.copy(t.getMyblob(), new File("xxx.xml"));
		FileOutputStream out = new FileOutputStream("yyy.xml");
		FileCopyUtils.copy(t.getMyblob2(), out);
		out.close();
		
	}
	
	@org.junit.Test
	public void test03_insert() throws IOException {
		Test t = new Test();
		t.setMydate(new Date());
//		byte[] myblob = FileCopyUtils.copyToByteArray(new File("pom.xml"));
//		InputStream myblob2 = new FileInputStream("pom.xml");
//		t.setMyblob(myblob);
//		t.setMyblob2(myblob2);
		int rtn = mapper.insert(t);
//		myblob2.close();
		System.out.println("rtn = " + rtn);
		
	}
	
	@org.junit.Test
	public void test04_updateByTestno() {
		
	}
	
	@org.junit.Test
	public void test05_deleteByTestno() {
		
	}
	

}
