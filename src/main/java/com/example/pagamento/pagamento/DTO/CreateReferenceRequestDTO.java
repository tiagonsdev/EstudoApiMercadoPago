package com.example.pagamento.pagamento.DTO;

import java.math.BigDecimal;
import java.util.List;

public record CreateReferenceRequestDTO(

        Long userId,
        BigDecimal totalAmount,
        PayerDto payer,
        BackUrlsDTO backUrls,
        DeliveryAddressDTO deliveryAddress,
        String notificationUrl,
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
