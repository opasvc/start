package com.start.start.mapper;

import com.start.start.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student.student")
    List<Student> StudentList();
}
