package com.ust.vendor.fegin;

import com.ust.vendor.config.OrderInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="order-service",url="http://localhost:9097/employee")
public interface OrderDetails {
    @GetMapping("/vendor/{id}")
    List<OrderInfo> getEmployeeByVendorId(@PathVariable("id") Long id);
}
