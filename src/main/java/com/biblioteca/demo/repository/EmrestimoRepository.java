package com.biblioteca.demo.repository;

import com.biblioteca.demo.entity.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmrestimoRepository extends JpaRepository<Emprestimo,Long> {
}
