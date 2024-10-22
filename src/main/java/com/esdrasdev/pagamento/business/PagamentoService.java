package com.esdrasdev.pagamento.business;

import com.esdrasdev.pagamento.controller.request.CartaoRequestDTO;
import com.esdrasdev.pagamento.infrastructure.client.PagamentoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PagamentoService {

    private final PagamentoClient pagamentoClient;

    public Boolean verificaPagamento(CartaoRequestDTO cartaoRequestDTO) {
        return pagamentoClient.verificaCartao(cartaoRequestDTO);
    }

}
