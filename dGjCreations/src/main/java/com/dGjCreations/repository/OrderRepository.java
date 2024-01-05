package com.dGjCreations.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dGjCreations.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findByOrderTime(String orderTime);
}
