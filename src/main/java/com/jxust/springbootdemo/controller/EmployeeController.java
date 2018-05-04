package com.jxust.springbootdemo.controller;

import com.jxust.springbootdemo.entity.Employee;
import com.jxust.springbootdemo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public Collection getAll() {
        return employeeService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employee getById(@PathVariable("id") Integer id) {
        return employeeService.getById(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Collection deleteById(@PathVariable("id") Integer id) {
        return employeeService.deleteById(id);
    }

    @RequestMapping( method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Collection add(@RequestBody Employee employee) {
        return employeeService.add(employee);
    }

    @RequestMapping( method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Collection update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }
}
