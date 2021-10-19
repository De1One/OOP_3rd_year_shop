package com.balaluevegor.shop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Schema(description = "Short info about pizza")
@Validated
public class Pizza {
    @NotNull
    @Schema(description = "Id of pizza",required = true)
    @JsonProperty("id")
    private Long id;

    @NotNull
    @Schema(description = "Name of pizza",required = true)
    @JsonProperty("name")
    private String name;

    @NotNull
    @Schema(description = "Calories of pizza",required = true)
    @JsonProperty("calories")
    private BigDecimal calories;

    @NotNull
    @Schema(description = "Relative image of pizza image",required = true)
    @JsonProperty("image")
    private String image;

    @NotNull
    @Schema(description = "Price of pizza",required = true)
    @JsonProperty("price")
    private BigDecimal price;

    @NotNull
    @Schema(description = "Weight of pizza",required = true)
    @JsonProperty("weight")
    private BigDecimal weight;

    @NotNull
    @Schema(description = "Diameter of pizza",required = true)
    @JsonProperty("diameter")
    private BigDecimal diameter;

}
