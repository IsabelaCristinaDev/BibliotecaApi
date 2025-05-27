package com.biblioteca.demo.repository;

import com.biblioteca.demo.entity.Livro;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Id> {

    List<Livro> findByLivroId(Long LivroId);
}
