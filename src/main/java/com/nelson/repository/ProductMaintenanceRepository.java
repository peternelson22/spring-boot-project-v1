package com.nelson.repository;

import com.nelson.model.ProductMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMaintenanceRepository extends JpaRepository<ProductMaintenance, Long> {
}
