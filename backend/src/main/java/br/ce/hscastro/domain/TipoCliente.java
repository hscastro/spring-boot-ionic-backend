package br.ce.hscastro.domain;

public enum TipoCliente {
	
	CPF(1, "CPF"),
	CNPJ(2, "CNPJ");
	
	private TipoCliente(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	private Integer cod;
	private String descricao;
	
	
	public Integer toEnum(Integer x) {
		if(x == null) {
			return null;
		}
		
		return 0;
	}

}
