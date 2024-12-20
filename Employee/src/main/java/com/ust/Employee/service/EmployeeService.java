package com.ust.Employee.service;

import com.ust.Employee.Entity.Employee;
import com.ust.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    public EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public Employee getEmployee(Long id){
        return employeeRepository.findById(id).orElse(null);
    }

    public List<Employee> findEmployeeByVendorId(Long vendorId){
        return employeeRepository.findEmployeeByVendorId(vendorId);
    }
    public List<Employee> getEmployeeByOrderType(String orderType){
        return employeeRepository.findEmpByDeliveryType(orderType);
    }


}
