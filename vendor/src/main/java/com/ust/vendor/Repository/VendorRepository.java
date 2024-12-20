package com.ust.vendor.Repository;

import com.ust.vendor.Entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor,Long> {
}
