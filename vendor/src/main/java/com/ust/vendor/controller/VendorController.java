package com.ust.vendor.controller;

import com.ust.vendor.Entity.Vendor;
import com.ust.vendor.config.FullResponse;
import com.ust.vendor.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor")
public class VendorController {
    @Autowired
    private VendorService service;

    @PostMapping("/addvendor")
    public Vendor addVendor(@RequestBody Vendor vendor) {
        return service.addVendor(vendor);
    }
    @GetMapping("/findallvendors")
    public List<Vendor> getAllVendors() {
        return service.getAllVendors();
    }

    @GetMapping("/vendor/{id}")
    public ResponseEntity<FullResponse> getVendorById(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.getVendorById(id));
    }

    @GetMapping("/findvendorbyid/{id}")
    public Vendor findVendorById(@PathVariable Long id) {
        return service.findVendorById(id);
    }
}
