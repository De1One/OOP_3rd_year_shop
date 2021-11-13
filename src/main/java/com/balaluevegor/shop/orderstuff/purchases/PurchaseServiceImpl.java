package com.balaluevegor.shop.orderstuff.purchases;

import com.balaluevegor.shop.goods.PizzaEntity;
import com.balaluevegor.shop.orderstuff.orders.OrderEntity;
import org.springframework.stereotype.Service;

@Service
public class PurchaseServiceImpl implements PurchaseService{
    private final PurchaseRepository purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository){
        this.purchaseRepository = purchaseRepository;
    }
    @Override
    public void addPurchase(OrderEntity orderEntity, PizzaEntity pizzaEntity, Integer number) {
        PurchaseEntity purchaseEntity = new PurchaseEntity();
        purchaseEntity.setNumber(number);
        purchaseEntity.setOrder(orderEntity);
        purchaseEntity.setPizza(pizzaEntity);
        purchaseRepository.saveAndFlush(purchaseEntity);
    }
}
