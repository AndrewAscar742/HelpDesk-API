package br.com.sp.helpDesk.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Prioridade {
	BAIXA(0, "BAIA"), MEDIA(1, "MEDIA"), FECHADO(2, "ALTA");
	
	private Integer id;
	private String descricao;
	
	public static Prioridade toEnum(Integer cod) {
		if (cod == null) return null;
		
		for (Prioridade perfil : Prioridade.values()) {
			if (cod.equals(perfil.getId())) return perfil;
		}
		
		throw new IllegalArgumentException("Prioridade Inválida");
	}
	
	
}
