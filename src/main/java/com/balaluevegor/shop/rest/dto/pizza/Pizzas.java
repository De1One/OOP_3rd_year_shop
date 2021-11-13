package com.balaluevegor.shop.rest.dto.pizza;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Schema
@Validated
public class Pizzas {

    @NotNull
    @Schema(description = "",required = true)
    @JsonProperty("pizza_list")
    private List<Pizza> pizzaList;
}
