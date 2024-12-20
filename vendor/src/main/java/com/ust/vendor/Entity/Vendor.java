package com.ust.vendor.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="vendor")
//@NoArgsConstructor
//@AllArgsConstructor


public class Vendor {
    @Id
    public Long id;
    public String vendorName;

    public Vendor() {
    }

    public String vendorAddress;
    public String contactNumber;
    public String email;
    public String serviceType;
    public double rating;
    public int yearsInBusiness;
    public String operationalHours;
    public double deliveryCharge;
    public String[] supportedRegions;

    public Vendor(Long id, String vendorName, String vendorAddress, String contactNumber, String email, String serviceType, double rating, int yearsInBusiness, String operationalHours, double deliveryCharge, String[] supportedRegions) {
        this.id = id;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.contactNumber = contactNumber;
        this.email = email;
        this.serviceType = serviceType;
        this.rating = rating;
        this.yearsInBusiness = yearsInBusiness;
        this.operationalHours = operationalHours;
        this.deliveryCharge = deliveryCharge;
        this.supportedRegions = supportedRegions;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYearsInBusiness() {
        return yearsInBusiness;
    }

    public void setYearsInBusiness(int yearsInBusiness) {
        this.yearsInBusiness = yearsInBusiness;
    }

    public String getOperationalHours() {
        return operationalHours;
    }

    public void setOperationalHours(String operationalHours) {
        this.operationalHours = operationalHours;
    }

    public double getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(double deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public String[] getSupportedRegions() {
        return supportedRegions;
    }

    public void setSupportedRegions(String[] supportedRegions) {
        this.supportedRegions = supportedRegions;
    }


}
