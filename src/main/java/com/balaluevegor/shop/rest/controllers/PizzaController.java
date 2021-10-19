package com.balaluevegor.shop.rest.controllers;

import com.balaluevegor.shop.dto.Pizza;
import com.balaluevegor.shop.dto.Pizzas;
import com.balaluevegor.shop.exception.PizzaNotFoundException;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@RestController
@Validated
//@RequestMapping("v1/pizzas")
public class PizzaController {
    private Pizzas pizzaList = new Pizzas();

    public PizzaController(){
        Pizza pizza = new Pizza();
        pizza.setId(1L);
        pizza.setName("Pepperoni");
        pizza.setCalories(new BigDecimal(500));
        pizza.setImage("");
        pizza.setPrice(new BigDecimal(1000));
        pizza.setWeight(new BigDecimal(1500));
        pizza.setDiameter(new BigDecimal(35));

        Pizza pizza1 = new Pizza();
        pizza1.setId(2L);
        pizza1.setName("Diablo");
        pizza1.setCalories(new BigDecimal(400));
        pizza1.setImage("");
        pizza1.setPrice(new BigDecimal(700));
        pizza1.setWeight(new BigDecimal(1200));
        pizza1.setDiameter(new BigDecimal(30));

        List<Pizza> temp = new ArrayList<>();
        temp.add(pizza);
        temp.add(pizza1);
        pizzaList.setPizzaList(temp);
    }



    @GetMapping(value = "pizzas",produces = MediaType.APPLICATION_JSON_VALUE)
    public Pizzas pizzas(){
        return pizzaList;
    }

    @GetMapping(value = "pizza/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Pizza pizza(@PathVariable Long id){

        return pizzaList.getPizzaList().stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new PizzaNotFoundException("No such cake"));
    }

    @PostMapping("pizza/post")
    public void postPizza(@ApiParam(required = true) @RequestBody Pizza pizza){
         List<Pizza> temp = new ArrayList<>();
         pizza.setId((long) pizzaList.getPizzaList().size()+1);
         temp.add(pizza);
         pizzaList.setPizzaList(Stream.concat(pizzaList.getPizzaList().stream(),temp.stream())
                 .collect(Collectors.toList()));
    }

}
