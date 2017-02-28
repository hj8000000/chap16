package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.domain.Emp;

@Mapper
public interface EmpMapper {
	
	@Select("select * from emp")
	List<Emp> selectAll();
	
//	@Select("select * from emp where empno=#{empno}")
//	Emp selectByempno(int empno);
//	
//	@Insert("insert into emp values (#{empno}, #{dname}, #{loc}")
//	int insert (Emp emp);
//	
//	@Update("update emp set ename=#{ename}, loc=#{loc} where empno=#{empno}")
//	int updateByempno (Emp emp);
//
//	@Delete("delete from emp where empno=#{empno}")
//	int deleteByempno (Emp empno);
}
