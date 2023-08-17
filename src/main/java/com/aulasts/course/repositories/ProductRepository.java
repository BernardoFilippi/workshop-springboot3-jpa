package com.aulasts.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulasts.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
