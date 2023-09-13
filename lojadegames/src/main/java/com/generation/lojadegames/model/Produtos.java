package com.generation.lojadegames.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatorio! ")
	@Size(min = 3, max = 255, message = "O atributo nome deve conter no minimo 03 e no maximo 255 caracteres")
	private String nomeProduto;
	
	@NotBlank(message = "O atributo descrição é obrigatorio! ")
	@Size(min = 10, max = 1000, message = "O atributo descrição deve conter no minimo 10 e no maximo 1000 caracteres")
	private String descricao;
	
	@NotNull(message = "o atributo preço é obrigatorio! ")
	@Column(precision=6, scale=2)
	private BigDecimal preco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	
}