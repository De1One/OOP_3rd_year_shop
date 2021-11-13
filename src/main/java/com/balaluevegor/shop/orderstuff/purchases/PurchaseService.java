package com.balaluevegor.shop.orderstuff.purchases;

import com.balaluevegor.shop.goods.PizzaEntity;
import com.balaluevegor.shop.orderstuff.orders.OrderEntity;

public interface PurchaseService {
    void addPurchase(OrderEntity orderEntity, PizzaEntity pizzaEntity, Integer number);
}
