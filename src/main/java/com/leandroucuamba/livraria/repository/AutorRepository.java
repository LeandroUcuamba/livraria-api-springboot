package com.leandroucuamba.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.leandroucuamba.livraria.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
