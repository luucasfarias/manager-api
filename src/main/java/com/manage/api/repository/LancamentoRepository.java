package com.manage.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manage.api.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
