package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Country;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryMapperTests {
	
	@Autowired
	CountryMapper mapper;
	
	@Test
	public void test00_confirmMapper() {
		System.out.println("mapper = " + mapper);
	}
	
	@Test
	public void test01_selectAll() {
		List<Country> list = mapper.selectAll();
		
		for (Country e : list) {
			System.out.println(e);
		}
	}
	
	@Test
	public void test01_selectAllWithCity() {
		List<Country> list = mapper.selectAllWithCity();
		
		for(Country country : list) {
			System.out.println(country);
		}
	}
	
	
	@Test
	public void test02_selectByCode() {
		Country country = mapper.selectByCode("USA");
		
		System.out.println("country = " + country);
	}
	
	@Test
	public void test03_insert() {
		
	}
	
	@Test
	public void test04_updateByCode() {
		
	}
	
	@Test
	public void test05_deleteByCode() {
		
	}
}
