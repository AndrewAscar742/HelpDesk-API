package br.com.sp.helpDesk.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sp.helpDesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
