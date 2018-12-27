package com.manage.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manage.api.model.Lancamento;
import com.manage.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
