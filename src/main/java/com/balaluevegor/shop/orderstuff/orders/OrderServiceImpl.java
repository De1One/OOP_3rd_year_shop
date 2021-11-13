package com.balaluevegor.shop.orderstuff.orders;

import com.balaluevegor.shop.rest.dto.orderReq.Order;
import com.balaluevegor.shop.users.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderEntity addOrder(Order order, UserEntity user) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setDelivery(order.getDelivery());
        orderEntity.setDeliveryAddress(order.getDeliveryAddress());
        orderEntity.setDeliveryTime(order.getDeliveryTime());
        orderEntity.setPayment(order.getPayment());
        orderEntity.setStatus(order.getOrderStatus());
        orderEntity.setUser(user);
        return orderRepository.saveAndFlush(orderEntity);
    }
}
