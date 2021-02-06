package br.ce.hscastro.domain;



public enum TipoCliente {
	
	CPF(1, "CPF"),
	CNPJ(2, "CNPJ");
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	private int cod;
	private String descricao;
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoCliente x: TipoCliente.values()) {
			
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido!");
	}

}
