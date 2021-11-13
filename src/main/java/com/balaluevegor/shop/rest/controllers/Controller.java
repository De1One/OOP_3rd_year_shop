package com.balaluevegor.shop.rest.controllers;

import com.balaluevegor.shop.goods.PizzaService;

import com.balaluevegor.shop.orderstuff.orders.OrderEntity;
import com.balaluevegor.shop.orderstuff.orders.OrderService;
import com.balaluevegor.shop.orderstuff.purchases.PurchaseService;
import com.balaluevegor.shop.rest.dto.orderReq.OrderFullInfo;
import com.balaluevegor.shop.rest.dto.orderReq.Purchase;
import com.balaluevegor.shop.rest.dto.pizza.PizzaFullInfo;
import com.balaluevegor.shop.rest.dto.pizza.Pizzas;
import com.balaluevegor.shop.users.UserEntity;
import com.balaluevegor.shop.users.UserService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@Validated
//@RequestMapping("v1/pizzas")
public class Controller {
    private final UserService userService;
    private final PizzaService pizzaService;
    private final PurchaseService purchaseService;
    private final OrderService orderService;

    @Autowired
    public Controller(PizzaService pizzaService,UserService userService,OrderService orderService,PurchaseService purchaseService) {
        this.pizzaService = pizzaService;
        this.userService = userService;
        this.orderService = orderService;
        this.purchaseService = purchaseService;
    }

    @GetMapping(value = "getPizzas",produces = MediaType.APPLICATION_JSON_VALUE)
    public Pizzas getPizzaList(){
        return pizzaService.getPizzas();
    }

    @GetMapping(value = "pizza/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public PizzaFullInfo getPizzaById(@PathVariable Long id){

        return pizzaService.getPizza(id);
    }

    @PostMapping("postPizza")
    public void postPizza(@ApiParam(required = true) @RequestBody @Valid PizzaFullInfo pizza){
         pizzaService.addPizza(pizza);
    }

    @PostMapping("addOrder")
    public void addOrder(@ApiParam(required = true) @RequestBody @Valid OrderFullInfo order){
        UserEntity userEntity = userService.addUser(order.getUser());
        OrderEntity orderEntity = orderService.addOrder(order.getOrder(), userEntity);
        for(Purchase purchase: order.getPurchases()){
            purchaseService.addPurchase(orderEntity,pizzaService.getPizzaEntity(purchase.getPizzaId()), purchase.getNumber());
        }
    }

}
