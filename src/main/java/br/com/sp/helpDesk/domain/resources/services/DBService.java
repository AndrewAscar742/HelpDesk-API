package br.com.sp.helpDesk.domain.resources.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sp.helpDesk.domain.Chamado;
import br.com.sp.helpDesk.domain.Cliente;
import br.com.sp.helpDesk.domain.Tecnico;
import br.com.sp.helpDesk.domain.enums.Prioridade;
import br.com.sp.helpDesk.domain.enums.Status;
import br.com.sp.helpDesk.domain.repositories.ChamadoRepository;
import br.com.sp.helpDesk.domain.repositories.ClienteRepository;
import br.com.sp.helpDesk.domain.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciarDB() {
		Tecnico tec1 = new Tecnico(null, "Valdir Cezar", "67086299170", "valdir@mail.com", "123");
		
		Cliente cli1 = new Cliente(null, "Linus Torvald", "14268285784", "torvalds@mail.com", "123");
		
		Chamado ch1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(ch1));
	}
}
