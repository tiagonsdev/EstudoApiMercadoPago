package com.example.pagamento.pagamento.client;

import com.example.pagamento.pagamento.dto.CreateReferenceRequestDTO;
import com.example.pagamento.pagamento.dto.CreateResponseDTO;
import com.mercadopago.MercadoPagoConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MercadoPagoClient {
    @Value("${mercado_pago.access_token}")
    private String acessToken;

    @Value("${mercado_pago.notification_url}")
    private String notificationUrl;

    public void init(){
        MercadoPagoConfig.setAccessToken(acessToken);
        log.info("iniciando mercado pago");
    }

    public CreateResponseDTO createPreference(CreateReferenceRequestDTO createReferenceRequestDTO){

    }
}
