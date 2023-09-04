package com.start.start.service.impl;

import com.start.start.mapper.StudentMapper;
import com.start.start.pojo.Student;
import com.start.start.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper mapper;

    @Override
    public List<Student> StudentList() {
        return mapper.StudentList();
    }
}
