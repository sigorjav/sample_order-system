package com.sigorjav.sample_ordersystem.order.service;

import com.sigorjav.sample_ordersystem.global.enumerator.GlobalResponseCode;
import com.sigorjav.sample_ordersystem.global.exception.BaseException;
import com.sigorjav.sample_ordersystem.order.dto.OrderDetailDto;
import com.sigorjav.sample_ordersystem.order.dto.OrderDto;
import com.sigorjav.sample_ordersystem.order.mapper.OrderDetailMapper;
import com.sigorjav.sample_ordersystem.order.mapper.OrderMapper;
import com.sigorjav.sample_ordersystem.order.repository.OrderDetailRepository;
import com.sigorjav.sample_ordersystem.order.repository.OrderRepository;
import com.sigorjav.sample_ordersystem.order.repository.entity.OrderDetailId;
import com.sigorjav.sample_ordersystem.order.repository.entity.OrderDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderDetailRepository orderDetailRepository;

    public Page<OrderDto.Response> getOrderList(Pageable pageable){
        return orderRepository.findAll(pageable).map(OrderMapper::toOrderResponseDto);
    }

    public OrderDetailDto.Response getOrderDetailInfo(Long orderId, String productId) throws BaseException {
        OrderDetailId orderDetailId = OrderDetailId.builder()
                .orderNumber(orderId)
                .productCode(productId)
                .build();
        OrderDetails orderDetails = orderDetailRepository.findById(orderDetailId).orElseThrow(() -> new BaseException(GlobalResponseCode.ORDER_DETAIL_NOT_FOUND));
        return OrderDetailMapper.toOrderDetailResponseDto(orderDetails,orderDetails.getOrders(),orderDetails.getProducts());
    }

}
