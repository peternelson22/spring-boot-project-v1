package com.nelson.repository;

import com.nelson.model.ProductHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductHireRepository extends JpaRepository<ProductHire, Long> {
}
