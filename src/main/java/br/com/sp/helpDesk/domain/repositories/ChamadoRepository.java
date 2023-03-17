package br.com.sp.helpDesk.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sp.helpDesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
