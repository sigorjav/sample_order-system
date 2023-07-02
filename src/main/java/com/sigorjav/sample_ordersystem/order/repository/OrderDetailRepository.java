package com.sigorjav.sample_ordersystem.order.repository;

import com.sigorjav.sample_ordersystem.order.repository.entity.OrderDetailId;
import com.sigorjav.sample_ordersystem.order.repository.entity.OrderDetails;
import com.sigorjav.sample_ordersystem.order.repository.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetails, OrderDetailId> {

}
