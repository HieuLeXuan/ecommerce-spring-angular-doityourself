package com.hieulexuan.ecommercebe.repository;

import com.hieulexuan.ecommercebe.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

    // TODO: 04/01/2023
    // find solution how to ''auto get data with /search/ parameter on url
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);
}
