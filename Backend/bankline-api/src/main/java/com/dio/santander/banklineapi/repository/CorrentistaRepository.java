package com.dio.santander.banklineapi.repository;

import com.dio.santander.banklineapi.model.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {
}
