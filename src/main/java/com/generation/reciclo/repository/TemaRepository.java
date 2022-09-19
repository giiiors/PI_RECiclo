package com.generation.reciclo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.reciclo.model.PostagemModel;
import com.generation.reciclo.model.TemaModel;

@Repository
public interface TemaRepository extends JpaRepository<TemaModel, Long>{

	public List<TemaModel>findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);

}


