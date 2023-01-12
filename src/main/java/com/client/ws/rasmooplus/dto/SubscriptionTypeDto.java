package com.client.ws.rasmooplus.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubscriptionTypeDto {
    private Long id;

    @NotBlank(message = "não pode ser nulo ou vazio")
    @Size(min = 5, max = 30, message = "deve ter entre 5 a 30 caracteres")
    private String name;

    @Max(value = 12, message = "não pode ser maior que 12")
    private Long accessMonth;

    @NotNull(message = "não pode ser nulo")
    private BigDecimal price;

    @NotBlank(message = "não pode ser nulo ou vazio")
    @Size(min = 5, max = 15, message = "deve ter entre 5 a 15 caracteres")
    private String productKey;
}
