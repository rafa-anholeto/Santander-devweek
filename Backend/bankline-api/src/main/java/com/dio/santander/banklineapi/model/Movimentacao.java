package com.dio.santander.banklineapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tab_movimentacao")
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "data_hora")
    private LocalDateTime dataHora;

    private String descricao;
    private Double valor;

    @Enumerated(EnumType.STRING)
    private MovimentacaoTipo tipo;

}
