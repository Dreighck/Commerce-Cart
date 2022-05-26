package com.example.commercecart.repo;

import com.example.commercecart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface CartRepo extends JpaRepository<Product,Integer> {
}
