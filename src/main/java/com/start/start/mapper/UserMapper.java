package com.start.start.mapper;

import com.start.start.pojo.Student;
import com.start.start.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from student.user")
    List<User> userList();
}
