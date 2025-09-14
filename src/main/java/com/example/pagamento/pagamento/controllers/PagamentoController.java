package com.example.pagamento.pagamento.controllers;


import com.example.pagamento.pagamento.dto.CreateReferenceRequestDTO;
import com.example.pagamento.pagamento.dto.CreateResponseDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payment")
@RequiredArgsConstructor
@Slf4j
public class PagamentoController {

    public ResponseEntity<CreateResponseDTO> createPreference(@Valid @RequestBody CreateReferenceRequestDTO request){

        try{


        }catch ()
    }
}
