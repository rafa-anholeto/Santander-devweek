package com.dio.santander.banklineapi.DTO;

import com.dio.santander.banklineapi.model.MovimentacaoTipo;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class MovimentacaoDTO {

    private String descricao;
    private Double valor;
    private MovimentacaoTipo tipo;
    private Integer idConta;
}
