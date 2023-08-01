package com.aulasts.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulasts.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
