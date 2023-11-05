package com.ecommerce.ecommerce.repository;

import com.ecommerce.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository< Product,Long> {
    // Add custom query methods if needed
}
