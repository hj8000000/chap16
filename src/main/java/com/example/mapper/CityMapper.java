package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.domain.City;

@Mapper
public interface CityMapper {
	
	@Select("select * from city")
	List<City> selectAll();
	
//	@Select("select * from city where cityno=#{cityno}")
//	city selectBycityno(int cityno);
//	
//	@Insert("insert into city values (#{cityno}, #{dname}, #{loc}")
//	int insert (city city);
//	
//	@Update("update city set ename=#{ename}, loc=#{loc} where cityno=#{cityno}")
//	int updateBycityno (city city);
//
//	@Delete("delete from city where cityno=#{cityno}")
//	int deleteBycityno (city cityno);
}
