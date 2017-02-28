package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.domain.Bonus;

@Mapper
public interface BonusMapper {
	
	@Select("select * from bonus")
	List<Bonus> selectAll();
	
//	@Select("select * from bonus where bonusno=#{bonusno}")
//	bonus selectBybonusno(int bonusno);
//	
//	@Insert("insert into bonus values (#{bonusno}, #{dname}, #{loc}")
//	int insert (bonus bonus);
//	
//	@Update("update bonus set ename=#{ename}, loc=#{loc} where bonusno=#{bonusno}")
//	int updateBybonusno (bonus bonus);
//
//	@Delete("delete from bonus where bonusno=#{bonusno}")
//	int deleteBybonusno (bonus bonusno);
}
