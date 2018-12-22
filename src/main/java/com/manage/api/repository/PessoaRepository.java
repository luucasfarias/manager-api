package com.manage.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manage.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
