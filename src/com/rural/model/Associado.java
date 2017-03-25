/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rural.model;

import com.rural.enums.Sexo;
import com.rural.enums.UF;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author JoseVitor
 */
@Entity
@Table(name = "Associado")
public class Associado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Associado")
    private int id;

    private String nome;
    private String apelido;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    private String cpf;
    private String rg;
    private String orgaoExpedidor;
    private LocalDate expedicaoDocumento;
    private String certidaoNascimentoCasamento;

    private String ctps;
    private String serieCtps;
    private String tituloEleitor;
    private String zonaEleitoral;
    private String secaoEleitoral;
    private String numeroBeneficio;
    private String especie;
    private String nit;
    private String profissao;
    private String regimeAtividade;

    private String tamanhoPropriedade;
    private String areaUtilizada;
    private String incra;
    private String enderecoProfissao;
    private String municipioProfissao;
    @Enumerated(EnumType.STRING)
    private UF ufProfissao;
    private LocalDate dataMoradiaProfissao;

    private String nomeProprietario;
    private String incraProprietario;
    private String areaUtilizadaProprietario;
    private String enderecoProprietario;
    private String municipioProprietario;
    @Enumerated(EnumType.STRING)
    private UF ufProprietario;
    private LocalDate dataMoradiaProprietario;

    private String assalariado;
    private String cargoAssalariado;

    private String enderecoAssalariado;
    private String municipioAssalariado;
    @Enumerated(EnumType.STRING)
    private UF ufAssalariado;
    private LocalDate dataMoradiaAssalariado;

    @OneToMany(mappedBy = "associado")
    private List<Dependente> dependentes;

    private String transferidoSTTR;
    private LocalDate dataTransferenciaSTTR;

    private String filiacaoMae;
    private String filiacaoPai;
    private String matricula;
    private String matriculaAnterior;
    private String primeiraMatricula;
    private LocalDate dataRecadastramento;
    private LocalDate dataExpedicao;
    private LocalDate dataAdmissao;
    private LocalDate dataNascimento;
    private String naturalidade;
    private String estadoCivil;
    private String conjuge;
    private String grauInstrucao;
    private String endereco;
    private String bairro;
    private String cidade;
    @Enumerated(EnumType.STRING)
    private UF uf;
    private String telefone;
    private String email;

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

    public LocalDate getExpedicaoDocumento() {
        return expedicaoDocumento;
    }

    public void setExpedicaoDocumento(LocalDate expedicaoDocumento) {
        this.expedicaoDocumento = expedicaoDocumento;
    }

    public String getCertidaoNascimentoCasamento() {
        return certidaoNascimentoCasamento;
    }

    public void setCertidaoNascimentoCasamento(String certidaoNascimentoCasamento) {
        this.certidaoNascimentoCasamento = certidaoNascimentoCasamento;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getSerieCtps() {
        return serieCtps;
    }

    public void setSerieCtps(String serieCtps) {
        this.serieCtps = serieCtps;
    }

    public String getTituloEleitor() {
        return tituloEleitor;
    }

    public void setTituloEleitor(String tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }

    public String getZonaEleitoral() {
        return zonaEleitoral;
    }

    public void setZonaEleitoral(String zonaEleitoral) {
        this.zonaEleitoral = zonaEleitoral;
    }

    public String getSecaoEleitoral() {
        return secaoEleitoral;
    }

    public void setSecaoEleitoral(String secaoEleitoral) {
        this.secaoEleitoral = secaoEleitoral;
    }

    public String getNumeroBeneficio() {
        return numeroBeneficio;
    }

    public void setNumeroBeneficio(String numeroBeneficio) {
        this.numeroBeneficio = numeroBeneficio;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
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

    public UF getUfProfissao() {
        return ufProfissao;
    }

    public void setUfProfissao(UF ufProfissao) {
        this.ufProfissao = ufProfissao;
    }

    public LocalDate getDataMoradiaProfissao() {
        return dataMoradiaProfissao;
    }

    public void setDataMoradiaProfissao(LocalDate dataMoradiaProfissao) {
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

    public UF getUfProprietario() {
        return ufProprietario;
    }

    public void setUfProprietario(UF ufProprietario) {
        this.ufProprietario = ufProprietario;
    }

    public LocalDate getDataMoradiaProprietario() {
        return dataMoradiaProprietario;
    }

    public void setDataMoradiaProprietario(LocalDate dataMoradiaProprietario) {
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

    public UF getUfAssalariado() {
        return ufAssalariado;
    }

    public void setUfAssalariado(UF ufAssalariado) {
        this.ufAssalariado = ufAssalariado;
    }

    public LocalDate getDataMoradiaAssalariado() {
        return dataMoradiaAssalariado;
    }

    public void setDataMoradiaAssalariado(LocalDate dataMoradiaAssalariado) {
        this.dataMoradiaAssalariado = dataMoradiaAssalariado;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    public String getTransferidoSTTR() {
        return transferidoSTTR;
    }

    public void setTransferidoSTTR(String transferidoSTTR) {
        this.transferidoSTTR = transferidoSTTR;
    }

    public LocalDate getDataTransferenciaSTTR() {
        return dataTransferenciaSTTR;
    }

    public void setDataTransferenciaSTTR(LocalDate dataTransferenciaSTTR) {
        this.dataTransferenciaSTTR = dataTransferenciaSTTR;
    }

    public String getPrimeiraMatricula() {
        return primeiraMatricula;
    }

    public void setPrimeiraMatricula(String primeiraMatricula) {
        this.primeiraMatricula = primeiraMatricula;
    }

    public LocalDate getDataRecadastramento() {
        return dataRecadastramento;
    }

    public void setDataRecadastramento(LocalDate dataRecadastramento) {
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

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getFiliacaoMae() {
        return filiacaoMae;
    }

    public void setFiliacaoMae(String filiacaoMae) {
        this.filiacaoMae = filiacaoMae;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(LocalDate dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    public String getMatriculaAnterior() {
        return matriculaAnterior;
    }

    public void setMatriculaAnterior(String matriculaAnterior) {
        this.matriculaAnterior = matriculaAnterior;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public LocalDate getNascimento() {
        return getDataNascimento();
    }

    public void setNascimento(LocalDate nascimento) {
        this.setDataNascimento(nascimento);
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

    /**
     * @return the filiacaoPai
     */
    public String getFiliacaoPai() {
        return filiacaoPai;
    }

    /**
     * @param filiacaoPai the filiacaoPai to set
     */
    public void setFiliacaoPai(String filiacaoPai) {
        this.filiacaoPai = filiacaoPai;
    }

    /**
     * @return the dataNascimento
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
