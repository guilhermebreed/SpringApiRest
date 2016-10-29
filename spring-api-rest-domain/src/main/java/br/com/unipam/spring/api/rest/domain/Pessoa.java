package br.com.unipam.spring.api.rest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "PESSOA")
public class Pessoa implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "NOME", nullable = false)
	private String nome;
	@Column(name = "TELEFONEFIXO", length = 11,nullable = true)
	private String telefoneFixo;
	@Column(name = "TELEFONECELULAR", length = 11, nullable = true)
	private String telefoneCelular;
	@Column(name = "LOGRADOURO", length = 80, nullable = false)
	private String logradouro;
	@Column(name = "BAIRRO", length = 80, nullable=false)
	private String bairro;
	@Column(name = "CIDADE", length = 60, nullable=false)
	private String cidade;
	@Column(name = "ESTADO", length = 40, nullable=false)
	private String estado;

	public Long getId(){
		return id;
	}

	public void setId(Long id){
		this.id = id;
	}

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

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }

        Product product = (Product) o;

        if (!id.equals(product.id)) {
            return false;
        }
        if (!name.equals(product.name)) {
            return false;
        }
        if (!value.equals(product.value)) {
            return false;
        }
        return date.equals(product.date);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + value.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }

}