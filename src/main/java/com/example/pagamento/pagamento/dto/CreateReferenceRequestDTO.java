package com.example.pagamento.pagamento.dto;

//DTO

import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.List;

public record CreateReferenceRequestDTO(

        Long userId,

        @DecimalMin(value = "0,01", message = "o valor minimo tem que ser maior que zero")
        BigDecimal totalAmount,

        @NotNull
        PayerDto payer,

        @NotNull
        BackUrlsDTO backUrls,

        @NotNull
        DeliveryAddressDTO deliveryAddress,

        @NotNull
        String notificationUrl,

        @NotNull
        @Valid
        List<ItemDTO> ItemDTO
) {
    public record PayerDto(
            String name,
            String surname,
            String email
    ){}

    public record BackUrlsDTO(
            String succes,
            String failure,
            String pending
    ){}

    public record DeliveryAddressDTO(
            String zipCode,
            String street,
            String number,
            String complement,
            String neighborhood,
            String city,
            String state
    ){}

    public record ItemDTO(
            String id,
            String title,
            String description,
            BigDecimal quantity,
            BigDecimal unitPrice
    ){}
}
