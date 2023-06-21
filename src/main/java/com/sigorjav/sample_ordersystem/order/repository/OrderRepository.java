package com.sigorjav.sample_ordersystem.order.repository;

import com.sigorjav.sample_ordersystem.order.repository.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orders,Long> {
}
