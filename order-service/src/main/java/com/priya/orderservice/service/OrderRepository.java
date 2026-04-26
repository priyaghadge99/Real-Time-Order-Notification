package com.priya.orderservice.service;

import com.priya.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
    List<Order> findByCustomerEmail(String email);
    List<Order> findByStatus(Order.OrderStatus status);
}
