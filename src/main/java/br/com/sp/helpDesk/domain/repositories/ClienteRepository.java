package br.com.sp.helpDesk.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sp.helpDesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
