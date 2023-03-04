package br.com.samuel.cadpessoas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.samuel.cadpessoas.model.Pessoa;

@Repository
public interface PessoaRepository
    extends JpaRepository<Pessoa, Long> {

}
