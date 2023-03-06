package br.com.sp.helpDesk.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Perfil {
	ADMIN(0, "ROLE_ADMIN"), CLIENTE(1, "ROLE_CLIENTE"), TECNICO(2, "ROLE_TECNICO");
	
	private Integer id;
	private String descricao;
	
	public static Perfil toEnum(Integer cod) {
		if (cod == null) return null;
		
		for (Perfil perfil : Perfil.values()) {
			if (cod.equals(perfil.getId())) return perfil;
		}
		
		throw new IllegalArgumentException("Perfil Inválido");
	}
	
	
}
