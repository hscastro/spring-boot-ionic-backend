package br.ce.hscastro.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ItemPedido {

	@EmbeddedId
	private ItemPedidoPk id = new ItemPedidoPk();
	
	private Double descontos;
	private Integer quantidade;
	private Double precos;
			
	public ItemPedido() {
		// TODO Auto-generated constructor stub
	}

	public ItemPedido(Pedido pedido, Produto produto, Double descontos, Integer quantidade, Double precos) {
		id.setPedido(pedido);
		id.setProduto(produto);
		this.descontos = descontos;
		this.quantidade = quantidade;
		this.precos = precos;
	}

		
	public Pedido getPedido() {
		return id.getPedido();
	}

	public Produto getProduto() {
		return id.getProduto() ;
	}
	
	public void setId(ItemPedidoPk id) {
		this.id = id;
	}

	public Double getDescontos() {
		return descontos;
	}

	public void setDescontos(Double descontos) {
		this.descontos = descontos;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecos() {
		return precos;
	}

	public void setPrecos(Double precos) {
		this.precos = precos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descontos == null) ? 0 : descontos.hashCode());
		result = prime * result + ((precos == null) ? 0 : precos.hashCode());
		result = prime * result + ((quantidade == null) ? 0 : quantidade.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemPedido other = (ItemPedido) obj;
		if (descontos == null) {
			if (other.descontos != null)
				return false;
		} else if (!descontos.equals(other.descontos))
			return false;
		if (precos == null) {
			if (other.precos != null)
				return false;
		} else if (!precos.equals(other.precos))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		return true;
	}
		
}
