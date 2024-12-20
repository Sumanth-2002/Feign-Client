package com.ust.Employee.controller;

import com.ust.Employee.Entity.Employee;
import com.ust.Employee.service.EmployeeService;
import jakarta.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/getEmployee/{id}")
    public  Employee getEmployee(@PathVariable("id") Long id){
        return  employeeService.getEmployee(id);
    }

    @GetMapping("/vendor/{id}")
    public List<Employee> getEmployeeByVendorId(@PathVariable("id") Long id){
        return employeeService.findEmployeeByVendorId(id);
    }

    @GetMapping("/orderType/{order}")
    public List<Employee> getEmployeeByOrderType(@PathVariable("order") String order){
//        List<String> orderType = Arrays.asList(order.split(","));
        return employeeService.getEmployeeByOrderType(order);
    }
}
