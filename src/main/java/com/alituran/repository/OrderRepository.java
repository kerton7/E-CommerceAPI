package com.alituran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alituran.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
