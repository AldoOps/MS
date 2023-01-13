package io.gft.msavaliadorcredito.domain;

import io.gft.msavaliadorcredito.domain.model.CartaoCliente;
import io.gft.msavaliadorcredito.domain.model.DadosCliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SituacaoCliente {
    private DadosCliente cliente;
    private List<CartaoCliente> cartoes;
}
