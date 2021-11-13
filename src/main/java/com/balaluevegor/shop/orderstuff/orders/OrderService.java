package com.balaluevegor.shop.orderstuff.orders;

import com.balaluevegor.shop.rest.dto.orderReq.Order;
import com.balaluevegor.shop.users.UserEntity;

public interface OrderService {
    OrderEntity addOrder(Order order, UserEntity user);
}
