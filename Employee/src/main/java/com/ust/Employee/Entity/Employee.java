package com.ust.Employee.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employee")
public class Employee {
    @Id
    public Long id;
    public String empName;
    public String address;
    public String  contact;
    public Long vendorId;
    public String ordered_On;
    public String estimatedDelivery;
    public Long orderId;
    public String deliveryType;
    public String status;


}
