package com.balaluevegor.shop.rest.dto.orderReq;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Data
@Schema(description = "Info about user")
@Validated
public class User {

    @Null
    @Schema(description = "UID", required = false)
    @JsonProperty("id")
    private Long id;

    @NotNull
    @Schema(description = "Username", required = true)
    @JsonProperty("name")
    private String name;

    @NotNull
    @Schema(description = "User number", required = true)
    @JsonProperty("number")
    private String number;

}