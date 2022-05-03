package com.dio.santander.banklineapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class Conta {
    @Column(name = "conta_numero")
    private Long numero;
    @Column(name = "conta_saldo")
    private Double saldo;
}
