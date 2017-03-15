/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintrab.model;

import java.util.Date;

/**
 *
 * @author JoseVitor
 */
public class Dependente {
    private String nome;
	private String parentesco;
	private Date nascimento;
	private Associado associado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Associado getAssociado() {
		return associado;
	}
	public void setAssociado(Associado associado) {
		this.associado = associado;
	}
}

