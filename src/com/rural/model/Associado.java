/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rural.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author JoseVitor
 */
@Entity
@Table(name="Associado")
public class Associado implements Serializable {
    
        @Id
	@SequenceGenerator(name="SEQ_ASSOCIADO", initialValue=1,
	allocationSize=1, sequenceName="seq_associado")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ASSOCIADO")
	@Column(name="id_Associado")
	private int id;

        private String nome;
	private String apelido;
	private String sexo;
	private String cpf;
	private String rg;
	private String orgaoExpedidor;
	private Date expedicaoDocumento;
	private String certidaoNascimentoCasamento;
	
	private int ctps;
	private int serieCtps;
	private int tituloEleitor;
	private int zonaEleitoral;
	private int secaoEleitoral;
	private int numeroBeneficio;
	private int especie;
	private int nit;
	private String profissao;
	private String regimeAtividade;
	
	private String tamanhoPropriedade;
	private String areaUtilizada;
	private String incra;
	private String enderecoProfissao;
	private String municipioProfissao;
	private String ufProfissao;
	private Date dataMoradiaProfissao;
	
	private String nomeProprietario;
	private String incraProprietario;
	private String areaUtilizadaProprietario;
	private String enderecoProprietario;
	private String municipioProprietario;
	private String ufProprietario;
	private Date dataMoradiaProprietario;
	
	private String assalariado;
	private String cargoAssalariado;
        
        private String enderecoAssalariado;
	private String municipioAssalariado;
	private String ufAssalariado;
	private Date dataMoradiaAssalariado;
	
        @OneToMany(mappedBy="associado")
	private List<Dependente> dependentes;
	
	private int transferidoSTTR;
	private Date dataTransferenciaSTTR;
	
	private String filiacao;
	private long matricula;
	private long matriculaAnterior;
	private long primeiraMatricula;
	private Date dataRecadastramento;
	private Date expedicao;
	private Date dataAdmissao;
	private Date nascimento;
	private String naturalidade;
	private String estadoCivil;
	private String conjuge;
	private String grauInstrucao;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private String telefone;
	private String email;
	private String foto;
        
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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
	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}
	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}
	public Date getExpedicaoDocumento() {
		return expedicaoDocumento;
	}
	public void setExpedicaoDocumento(Date expedicaoDocumento) {
		this.expedicaoDocumento = expedicaoDocumento;
	}
	public String getCertidaoNascimentoCasamento() {
		return certidaoNascimentoCasamento;
	}
	public void setCertidaoNascimentoCasamento(String certidaoNascimentoCasamento) {
		this.certidaoNascimentoCasamento = certidaoNascimentoCasamento;
	}
	public int getCtps() {
		return ctps;
	}
	public void setCtps(int ctps) {
		this.ctps = ctps;
	}
	public int getSerieCtps() {
		return serieCtps;
	}
	public void setSerieCtps(int serieCtps) {
		this.serieCtps = serieCtps;
	}
	public int getTituloEleitor() {
		return tituloEleitor;
	}
	public void setTituloEleitor(int tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}
	public int getZonaEleitoral() {
		return zonaEleitoral;
	}
	public void setZonaEleitoral(int zonaEleitoral) {
		this.zonaEleitoral = zonaEleitoral;
	}
	public int getSecaoEleitoral() {
		return secaoEleitoral;
	}
	public void setSecaoEleitoral(int secaoEleitoral) {
		this.secaoEleitoral = secaoEleitoral;
	}
	public int getNumeroBeneficio() {
		return numeroBeneficio;
	}
	public void setNumeroBeneficio(int numeroBeneficio) {
		this.numeroBeneficio = numeroBeneficio;
	}
	public int getEspecie() {
		return especie;
	}
	public void setEspecie(int especie) {
		this.especie = especie;
	}
	public int getNit() {
		return nit;
	}
	public void setNit(int nit) {
		this.nit = nit;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getRegimeAtividade() {
		return regimeAtividade;
	}
	public void setRegimeAtividade(String regimeAtividade) {
		this.regimeAtividade = regimeAtividade;
	}
	public String getTamanhoPropriedade() {
		return tamanhoPropriedade;
	}
	public void setTamanhoPropriedade(String tamanhoPropriedade) {
		this.tamanhoPropriedade = tamanhoPropriedade;
	}
	public String getAreaUtilizada() {
		return areaUtilizada;
	}
	public void setAreaUtilizada(String areaUtilizada) {
		this.areaUtilizada = areaUtilizada;
	}
	public String getIncra() {
		return incra;
	}
	public void setIncra(String incra) {
		this.incra = incra;
	}
	public String getEnderecoProfissao() {
		return enderecoProfissao;
	}
	public void setEnderecoProfissao(String enderecoProfissao) {
		this.enderecoProfissao = enderecoProfissao;
	}
	public String getMunicipioProfissao() {
		return municipioProfissao;
	}
	public void setMunicipioProfissao(String municipioProfissao) {
		this.municipioProfissao = municipioProfissao;
	}
	public String getUfProfissao() {
		return ufProfissao;
	}
	public void setUfProfissao(String ufProfissao) {
		this.ufProfissao = ufProfissao;
	}
	public Date getDataMoradiaProfissao() {
		return dataMoradiaProfissao;
	}
	public void setDataMoradiaProfissao(Date dataMoradiaProfissao) {
		this.dataMoradiaProfissao = dataMoradiaProfissao;
	}
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	public String getIncraProprietario() {
		return incraProprietario;
	}
	public void setIncraProprietario(String incraProprietario) {
		this.incraProprietario = incraProprietario;
	}
	public String getAreaUtilizadaProprietario() {
		return areaUtilizadaProprietario;
	}
	public void setAreaUtilizadaProprietario(String areaUtilizadaProprietario) {
		this.areaUtilizadaProprietario = areaUtilizadaProprietario;
	}
	public String getEnderecoProprietario() {
		return enderecoProprietario;
	}
	public void setEnderecoProprietario(String enderecoProprietario) {
		this.enderecoProprietario = enderecoProprietario;
	}
	public String getMunicipioProprietario() {
		return municipioProprietario;
	}
	public void setMunicipioProprietario(String municipioProprietario) {
		this.municipioProprietario = municipioProprietario;
	}
	public String getUfProprietario() {
		return ufProprietario;
	}
	public void setUfProprietario(String ufProprietario) {
		this.ufProprietario = ufProprietario;
	}
	public Date getDataMoradiaProprietario() {
		return dataMoradiaProprietario;
	}
	public void setDataMoradiaProprietario(Date dataMoradiaProprietario) {
		this.dataMoradiaProprietario = dataMoradiaProprietario;
	}
	public String getAssalariado() {
		return assalariado;
	}
	public void setAssalariado(String assalariado) {
		this.assalariado = assalariado;
	}
	public String getCargoAssalariado() {
		return cargoAssalariado;
	}
	public void setCargoAssalariado(String cargoAssalariado) {
		this.cargoAssalariado = cargoAssalariado;
	}
	public String getEnderecoAssalariado() {
		return enderecoAssalariado;
	}
	public void setEnderecoAssalariado(String enderecoAssalariado) {
		this.enderecoAssalariado = enderecoAssalariado;
	}
	public String getMunicipioAssalariado() {
		return municipioAssalariado;
	}
	public void setMunicipioAssalariado(String municipioAssalariado) {
		this.municipioAssalariado = municipioAssalariado;
	}
	public String getUfAssalariado() {
		return ufAssalariado;
	}
	public void setUfAssalariado(String ufAssalariado) {
		this.ufAssalariado = ufAssalariado;
	}
	public Date getDataMoradiaAssalariado() {
		return dataMoradiaAssalariado;
	}
	public void setDataMoradiaAssalariado(Date dataMoradiaAssalariado) {
		this.dataMoradiaAssalariado = dataMoradiaAssalariado;
	}
	public List<Dependente> getDependentes() {
		return dependentes;
	}
	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}
	public int getTransferidoSTTR() {
		return transferidoSTTR;
	}
	public void setTransferidoSTTR(int transferidoSTTR) {
		this.transferidoSTTR = transferidoSTTR;
	}
	public Date getDataTransferenciaSTTR() {
		return dataTransferenciaSTTR;
	}
	public void setDataTransferenciaSTTR(Date dataTransferenciaSTTR) {
		this.dataTransferenciaSTTR = dataTransferenciaSTTR;
	}
	public long getPrimeiraMatricula() {
		return primeiraMatricula;
	}
	public void setPrimeiraMatricula(long primeiraMatricula) {
		this.primeiraMatricula = primeiraMatricula;
	}
	public Date getDataRecadastramento() {
		return dataRecadastramento;
	}
	public void setDataRecadastramento(Date dataRecadastramento) {
		this.dataRecadastramento = dataRecadastramento;
	}
	public String getGrauInstrucao() {
		return grauInstrucao;
	}
	public void setGrauInstrucao(String grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getFiliacao() {
		return filiacao;
	}
	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public Date getExpedicao() {
		return expedicao;
	}
	public void setExpedicao(Date expedicao) {
		this.expedicao = expedicao;
	}
	public long getMatriculaAnterior() {
		return matriculaAnterior;
	}
	public void setMatriculaAnterior(long matriculaAnterior) {
		this.matriculaAnterior = matriculaAnterior;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getConjuge() {
		return conjuge;
	}
	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}
}
