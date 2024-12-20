package com.ust.vendor.service;

import com.ust.vendor.Entity.Vendor;
import com.ust.vendor.Repository.VendorRepository;
import com.ust.vendor.config.FullResponse;
import com.ust.vendor.config.OrderInfo;
import com.ust.vendor.fegin.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {
    @Autowired
    private VendorRepository vendorRepository;

    @Autowired
    public OrderDetails orderDetails;

    public Vendor addVendor(Vendor vendor){
        return  vendorRepository.save(vendor);
    }
    public List<Vendor> getAllVendors(){
        return vendorRepository.findAll();
    }
    public Vendor findVendorById(Long id){
        return vendorRepository.findById(id).orElse(null);
    }
    public FullResponse getVendorById(Long id) {
        // Attempt to find the vendor by ID
        Vendor vendor = vendorRepository.findById(id).orElse(null);

        // If the vendor is not found, handle it gracefully (for example, returning an error response)
        if (vendor == null) {
            // You can throw an exception, return a specific response, or handle the error as needed.
            // Here we will return a custom message.
            throw new RuntimeException("Vendor not found with ID: " + id);
        }

        // Fetch related order information from another service
        List<OrderInfo> p = orderDetails.getEmployeeByVendorId(id);

        // Prepare the response with vendor details and order info
        FullResponse fullResponse = new FullResponse();
        fullResponse.setVendorName(vendor.getVendorName());
        fullResponse.setVendorAddress(vendor.getVendorAddress());
        fullResponse.setContactNumber(vendor.getContactNumber());
        fullResponse.setEmail(vendor.getEmail());
        fullResponse.setOperationalHours(vendor.getOperationalHours());
        fullResponse.setSupportedRegions(vendor.getSupportedRegions());
        fullResponse.setOrderInfo(p);

        return fullResponse;
    }

}
