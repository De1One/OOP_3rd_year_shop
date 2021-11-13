package com.balaluevegor.shop.rest.advice;

import com.balaluevegor.shop.goods.PizzaService;
import com.balaluevegor.shop.rest.controllers.Controller;
import com.balaluevegor.shop.rest.dto.pizza.PizzaFullInfo;
import com.balaluevegor.shop.rest.dto.pizza.Pizzas;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.springframework.test.util.AssertionErrors;

import static org.mockito.ArgumentMatchers.any;

public class PizzaControllerTest {/*
    @Test
    void testPizzas(){
        Pizzas pizzas = new Pizzas();
        PizzaService pizzaService = Mockito.mock(PizzaService.class);
        Mockito.doReturn(pizzas).when(pizzaService).getPizzas();
        Controller pizzaController = new Controller(pizzaService);
        Pizzas pizzas1 = pizzaController.getPizzaList();
        AssertionErrors.assertEquals("!",pizzas1,pizzas);
        Mockito.verify(pizzaService,Mockito.times(1)).getPizzas();
    }
    @Test
    void testByIdPizzas(){
        PizzaFullInfo pizzaFullInfo = new PizzaFullInfo();
        PizzaService pizzaService = Mockito.mock(PizzaService.class);
        Mockito.doReturn(pizzaFullInfo).when(pizzaService).getPizza(any());
        Controller pizzaController = new Controller(pizzaService);
        PizzaFullInfo pizzaFullInfo1 = pizzaController.getPizzaById(1L);
        AssertionErrors.assertEquals("!",pizzaFullInfo1,pizzaFullInfo);
        ArgumentCaptor<Long> argumentCaptor = ArgumentCaptor.forClass(Long.class);
        Mockito.verify(pizzaService,Mockito.times(1)).getPizza(argumentCaptor.capture());
        AssertionErrors.assertEquals("?",argumentCaptor.getValue(),1L);
    }*/
}
