package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.domain.Country;

@Mapper
public interface CountryMapper {
	
	@Select("select * from country")
	List<Country> selectAll();
	
	List<Country> selectAllWithCity();
	
	@Select("select * from country where code=#{code}")
	Country selectByCode(String code);
//	
//	@Insert("insert into emp values (#{empno}, #{dname}, #{loc}")
//	int insert (Country country);
//	
//	@Update("update emp set ename=#{ename}, loc=#{loc} where empno=#{empno}")
//	int updateByCode (Country country);
//
//	@Delete("delete from emp where empno=#{empno}")
//	int deleteByCode (Country code);
}
