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
	
	@Select("select * from emp where empno=#{empno}")
	Emp selectByempno(int empno);
	
	@Insert("insert into emp values (#{empno}, #{ename}, #{job}, #{mgr}, #{hiredate}, #{sal}, #{comm}")
	int insert (Emp emp);
	
	@Update("update emp set ename=#{ename}, job=#{job}, mrg=#{mgr}, hiredate=#{hiredate}, sal=#{sal}, comm=#{comm} where empno=#{empno}")
	int updateByempno (Emp emp);

	@Delete("delete from emp where empno=#{empno}")
	int deleteByempno (Emp empno);
}
