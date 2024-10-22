package com.esdrasdev.pagamento.controller.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class enderecoRequestDTO {

    private String rua;

    private Long numero;

    private String bairro;

    private String complemento;

    private String cidade;

    private String cep;

}
