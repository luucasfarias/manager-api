package com.manage.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manage.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
