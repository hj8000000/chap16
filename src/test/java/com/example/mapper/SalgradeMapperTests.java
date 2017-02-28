package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Salgrade;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SalgradeMapperTests {
	
	@Autowired
	SalgradeMapper mapper;
	
	@Test
	public void test00_confirmMapper() {
		System.out.println("mapper = " + mapper);
	}
	
	@Test
	public void test01_selectAll() {
		List<Salgrade> list = mapper.selectAll();
		
		for (Salgrade e : list) {
			System.out.println(e);
		}
	}
	
	@Test
	public void test02_selectByEmptno() {
		
	}
	
	@Test
	public void test03_insert() {
		
	}
	
	@Test
	public void test04_updateByEmptno() {
		
	}
	
	@Test
	public void test05_deleteByEmpno() {
		
	}
}
