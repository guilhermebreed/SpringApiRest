package br.com.unipam.spring.api.rest.request;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class PessoaRequest{
	@NotNull
	private String nome;
	private String telefoneFixo;
	private String telefoneCelular;
	@NotNull
	private String logradouro;
	@NotNull
	private String bairro;
	@NotNull
	private String cidade;
	@NotNull
	private String estado;

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getTelefoneFixo(){
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo){
		this.telefoneFixo = telefoneFixo;
	}

	public String getTelefoneCelular(){
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular){
		this.telefoneCelular = telefoneCelular;
	}

	public String getLogradouro(){
		return logradouro;
	}

	public void setLogradouro(String logradouro){
		this.logradouro = logradouro;
	}

	public String getCidade(){
		return cidades;
	}

	public void setCidade(String cidade){
		this.cidade = cidade;
	}

	public String getEstado(){
		return estado;
	}

	public void setEstado(String estado){
		this.estado = estado;
	}

}