package com.biblioteca.demo.repository;

import com.biblioteca.demo.entity.Emprestimo;
import com.biblioteca.demo.entity.Livro;
import com.biblioteca.demo.entity.StatusEmprestimo;
import com.biblioteca.demo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface EmrestimoRepository extends JpaRepository<Emprestimo,Long> {
    List<Emprestimo> findByUsuarioAndStatus(Usuario usuario, StatusEmprestimo status);
    boolean existsByLivroAndStatus(Livro livro, StatusEmprestimo status);
}
