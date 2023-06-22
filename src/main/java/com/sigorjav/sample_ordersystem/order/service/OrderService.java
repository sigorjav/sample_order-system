package com.sigorjav.sample_ordersystem.order.service;

import com.sigorjav.sample_ordersystem.order.repository.OrderRepository;
import com.sigorjav.sample_ordersystem.order.repository.entity.Orders;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Page<Orders> getOrderList(Pageable pageable){
        return orderRepository.findAll(pageable);
    }

}
