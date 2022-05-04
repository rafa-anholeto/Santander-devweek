package com.dio.santander.banklineapi.services;

import com.dio.santander.banklineapi.DTO.CorrentistaDTO;
import com.dio.santander.banklineapi.model.Conta;
import com.dio.santander.banklineapi.model.Correntista;
import com.dio.santander.banklineapi.repository.CorrentistaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CorrentistaService {
    @Autowired
    private CorrentistaRepository correntistaRepository;

    public void save(CorrentistaDTO correntistaDTO){
        Correntista correntista = new Correntista();
        BeanUtils.copyProperties(correntistaDTO, correntista);

        Conta conta = new Conta();
        conta.setSaldo(0.0);
        conta.setNumero(new Date().getTime());

        correntista.setConta(conta);
        correntistaRepository.save(correntista);
    }
}
