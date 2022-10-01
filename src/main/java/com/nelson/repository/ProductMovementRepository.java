package com.nelson.repository;

import com.nelson.model.ProductMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMovementRepository extends JpaRepository<ProductMovement, Long> {
}
