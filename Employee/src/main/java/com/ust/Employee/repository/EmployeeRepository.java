package com.ust.Employee.repository;

import com.ust.Employee.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findEmployeeByVendorId(Long vendorId);
    List<Employee> findEmpByDeliveryType(String deliveryType);
}
