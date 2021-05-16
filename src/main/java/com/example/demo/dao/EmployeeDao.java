package com.example.demo.dao;

import com.example.demo.domain.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface EmployeeDao {
    @Select("select * from employee")
    List<Employee> findAll();

    @Select("select * from employee where id = #{id}")
    Employee findOne(Integer id);
}
