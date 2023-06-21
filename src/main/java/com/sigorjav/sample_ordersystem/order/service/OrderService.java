package com.sigorjav.sample_ordersystem.order.service;

import com.sigorjav.sample_ordersystem.order.repository.OrderRepository;
import com.sigorjav.sample_ordersystem.order.repository.entity.Orders;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public List<Orders> getOrderList(){
        return orderRepository.findAll();
    }

}
