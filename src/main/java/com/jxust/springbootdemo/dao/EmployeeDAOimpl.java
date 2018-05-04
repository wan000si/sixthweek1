package com.jxust.springbootdemo.dao;

import com.jxust.springbootdemo.entity.Employee;
import com.jxust.springbootdemo.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("employeeDAO")
public class EmployeeDAOimpl implements EmployeeDAO {

    private Map employeeMap=new HashMap(){{
        put(0, new Employee(0, "小明", 20, "男"));
        put(1, new Employee(1, "小红", 19, "女"));
        put(2, new Employee(2, "小智", 15, "男"));
        put(3, new Employee(3, "小刚", 16, "男"));
        put(4, new Employee(4, "小霞", 15, "女"));
    }};

    @Override
    public Collection getAll() {
        return employeeMap.values();
    }

    @Override
    public Employee getById(Integer id) {
        return (Employee) employeeMap.get(id);
    }

    @Override
    public Collection deleteById(Integer id) {
        employeeMap.remove(id);
        return employeeMap.values();
    }

    @Override
    public Collection add(Employee employee) {
        employeeMap.put(employee.getId(), employee);
        return employeeMap.values();
    }

    @Override
    public Collection update(Employee employee) {
        employeeMap.put(employee.getId(), employee);
        return employeeMap.values();
    }
}
