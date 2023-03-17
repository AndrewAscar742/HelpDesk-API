package br.com.sp.helpDesk.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sp.helpDesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
