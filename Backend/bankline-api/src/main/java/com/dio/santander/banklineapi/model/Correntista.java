package com.dio.santander.banklineapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Correntista {
    private Integer id;
    private String cpf;
    private String name;

    private Conta conta;

}
