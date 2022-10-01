package com.nelson.repository;

import com.nelson.model.ProductMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMakeRepository extends JpaRepository<ProductMake, Long> {
}
