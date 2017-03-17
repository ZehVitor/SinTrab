/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintrab.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author JoseVitor
 */
@Entity
@Table(name="Dependente")
public class Dependente implements Serializable {
    
        @Id
	@SequenceGenerator(name="SEQ_DEPENDENTE", initialValue=1,
	allocationSize=1, sequenceName="seq_dependente")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_DEPENDENTE")
	@Column(name="id_Dependente")
	private int id;
     
        private String nome;
	private String parentesco;
	private Date nascimento;
        
        @ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.REFRESH)
	@JoinColumn(name = "associado")
	private Associado associado;
	
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

