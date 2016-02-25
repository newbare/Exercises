package br.com.caelum.modelo;

import java.util.Calendar;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String rg;
	private Calendar dataDeNascimento;
	
	//Constructor
	public Cliente() {}

	
	//Getters and Setters  
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}


	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}


	public void setDataDeNascimento(Calendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	
	
}
