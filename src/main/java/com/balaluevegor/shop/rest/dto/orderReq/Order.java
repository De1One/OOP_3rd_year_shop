package com.balaluevegor.shop.rest.dto.orderReq;

import com.balaluevegor.shop.orderstuff.Delivery;
import com.balaluevegor.shop.orderstuff.OrderStatus;
import com.balaluevegor.shop.orderstuff.Payment;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.time.LocalDateTime;

@Data
@Schema(description = "Info about order")
@Validated
public class Order {
    @Null
    @Schema(description = "id", required = false)
    @JsonProperty("id")
    private Long id;

    @NotNull
    @Schema(description = "UID", required = true)
    @JsonProperty("UID")
    private Long UID;

    @NotNull
    @Schema(description = "order status", required = true)
    @JsonProperty("orderStatus")
    private OrderStatus orderStatus;

    @NotNull
    @Schema(description = "payment", required = true)
    @JsonProperty("payment")
    private Payment payment;

    @NotNull
    @Schema(description = "delivery", required = true)
    @JsonProperty("delivery")
    private Delivery delivery;

    @NotNull
    @Schema(description = "delivery address", required = true)
    @JsonProperty("deliveryAddress")
    private String deliveryAddress;

    @NotNull
    @Schema(description = "delivery time", required = true)
    @JsonProperty("delivery time")
    private LocalDateTime deliveryTime;
}
