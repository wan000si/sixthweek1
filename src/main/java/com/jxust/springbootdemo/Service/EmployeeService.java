package com.jxust.springbootdemo.Service;

import com.jxust.springbootdemo.entity.Employee;

import java.util.Collection;

public interface EmployeeService {

        /**
         * 获取所有员工对象
         *
         * @return Collection
         */
        public Collection getAll();

        /**
         * @param id 传入要获取的员工id
         * @return Employee
         * 返回对应的员工对象
         **/
        public Employee getById(Integer id);

        /**
         * @param id 传入要删除的员工id
         * @return Collection
         * 删除成功后返回所有员工对象
         */
        public Collection deleteById(Integer id);

        /**
         * @param employee 传入要添加的员工对象
         * @return 添加成功后返回所有员工对象
         */
        public Collection add(Employee employee);

        /**
         * @param employee 传入要修改的员工对象
         * @return 修改成功后返回所有员工对象
         */
        public Collection update(Employee employee);

}
