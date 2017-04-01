/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rural.model;

import com.rural.enums.RegimeAtividade;
import com.rural.enums.Sexo;
import com.rural.enums.UF;
import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.TemporalType;

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
    private String certidaoNascimentoCasamento;

    private String ctps;
    private String serieCtps;
    private String tituloEleitor;
    private String zonaEleitoral;
    private String secaoEleitoral;
    private String numeroBeneficio;
    private String especieBeneficio;
    private String nit;

    private String profissao;
    @Enumerated(EnumType.STRING)
    private RegimeAtividade regimeAtividade;
    private String nomeProprietario;
    private String tamanhoPropriedade;
    private String areaUtilizada;
    private String incra;
    private String enderecoPropriedade;
    private String municipioPropriedade;
    @Enumerated(EnumType.STRING)
    private UF ufPropriedade;
    @Temporal(TemporalType.DATE)
    private Date dataPropriedade;
    private String empresaPropriedade;
    private String cargoPropriedade;

    @OneToMany(mappedBy = "associado")
    private List<Dependente> dependentes;

    private String transferidoSTTR;
    @Temporal(TemporalType.DATE)
    private Date dataTransferenciaSTTR;

    private String filiacaoMae;
    private String filiacaoPai;
    private String matriculaAnterior;
    @Temporal(TemporalType.DATE)
    private Date dataRecadastramento;
    @Temporal(TemporalType.DATE)
    private Date dataExpedicao;
    @Temporal(TemporalType.DATE)
    private Date dataExpedicaoRG;
    @Temporal(TemporalType.DATE)
    private Date dataAdmissao;
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
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

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the apelido
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * @param apelido the apelido to set
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    /**
     * @return the sexo
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the orgaoExpedidor
     */
    public String getOrgaoExpedidor() {
        return orgaoExpedidor;
    }

    /**
     * @param orgaoExpedidor the orgaoExpedidor to set
     */
    public void setOrgaoExpedidor(String orgaoExpedidor) {
        this.orgaoExpedidor = orgaoExpedidor;
    }

    /**
     * @return the certidaoNascimentoCasamento
     */
    public String getCertidaoNascimentoCasamento() {
        return certidaoNascimentoCasamento;
    }

    /**
     * @param certidaoNascimentoCasamento the certidaoNascimentoCasamento to set
     */
    public void setCertidaoNascimentoCasamento(String certidaoNascimentoCasamento) {
        this.certidaoNascimentoCasamento = certidaoNascimentoCasamento;
    }

    /**
     * @return the ctps
     */
    public String getCtps() {
        return ctps;
    }

    /**
     * @param ctps the ctps to set
     */
    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    /**
     * @return the serieCtps
     */
    public String getSerieCtps() {
        return serieCtps;
    }

    /**
     * @param serieCtps the serieCtps to set
     */
    public void setSerieCtps(String serieCtps) {
        this.serieCtps = serieCtps;
    }

    /**
     * @return the tituloEleitor
     */
    public String getTituloEleitor() {
        return tituloEleitor;
    }

    /**
     * @param tituloEleitor the tituloEleitor to set
     */
    public void setTituloEleitor(String tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }

    /**
     * @return the zonaEleitoral
     */
    public String getZonaEleitoral() {
        return zonaEleitoral;
    }

    /**
     * @param zonaEleitoral the zonaEleitoral to set
     */
    public void setZonaEleitoral(String zonaEleitoral) {
        this.zonaEleitoral = zonaEleitoral;
    }

    /**
     * @return the secaoEleitoral
     */
    public String getSecaoEleitoral() {
        return secaoEleitoral;
    }

    /**
     * @param secaoEleitoral the secaoEleitoral to set
     */
    public void setSecaoEleitoral(String secaoEleitoral) {
        this.secaoEleitoral = secaoEleitoral;
    }

    /**
     * @return the numeroBeneficio
     */
    public String getNumeroBeneficio() {
        return numeroBeneficio;
    }

    /**
     * @param numeroBeneficio the numeroBeneficio to set
     */
    public void setNumeroBeneficio(String numeroBeneficio) {
        this.numeroBeneficio = numeroBeneficio;
    }

    /**
     * @return the especieBeneficio
     */
    public String getEspecieBeneficio() {
        return especieBeneficio;
    }

    /**
     * @param especieBeneficio the especieBeneficio to set
     */
    public void setEspecieBeneficio(String especieBeneficio) {
        this.especieBeneficio = especieBeneficio;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * @return the tamanhoPropriedade
     */
    public String getTamanhoPropriedade() {
        return tamanhoPropriedade;
    }

    /**
     * @param tamanhoPropriedade the tamanhoPropriedade to set
     */
    public void setTamanhoPropriedade(String tamanhoPropriedade) {
        this.tamanhoPropriedade = tamanhoPropriedade;
    }

    /**
     * @return the areaUtilizada
     */
    public String getAreaUtilizada() {
        return areaUtilizada;
    }

    /**
     * @param areaUtilizada the areaUtilizada to set
     */
    public void setAreaUtilizada(String areaUtilizada) {
        this.areaUtilizada = areaUtilizada;
    }

    /**
     * @return the incra
     */
    public String getIncra() {
        return incra;
    }

    /**
     * @param incra the incra to set
     */
    public void setIncra(String incra) {
        this.incra = incra;
    }

    /**
     * @return the enderecoPropriedade
     */
    public String getEnderecoPropriedade() {
        return enderecoPropriedade;
    }

    /**
     * @param enderecoPropriedade the enderecoPropriedade to set
     */
    public void setEnderecoPropriedade(String enderecoPropriedade) {
        this.enderecoPropriedade = enderecoPropriedade;
    }

    /**
     * @return the municipioPropriedade
     */
    public String getMunicipioPropriedade() {
        return municipioPropriedade;
    }

    /**
     * @param municipioPropriedade the municipioPropriedade to set
     */
    public void setMunicipioPropriedade(String municipioPropriedade) {
        this.municipioPropriedade = municipioPropriedade;
    }

    /**
     * @return the ufPropriedade
     */
    public UF getUfPropriedade() {
        return ufPropriedade;
    }

    /**
     * @param ufPropriedade the ufPropriedade to set
     */
    public void setUfPropriedade(UF ufPropriedade) {
        this.ufPropriedade = ufPropriedade;
    }

    /**
     * @return the dataPropriedade
     */
    public Date getDataPropriedade() {
        return dataPropriedade;
    }

    /**
     * @param dataPropriedade the dataPropriedade to set
     */
    public void setDataPropriedade(Date dataPropriedade) {
        this.dataPropriedade = dataPropriedade;
    }

    /**
     * @return the nomeProprietario
     */
    public String getNomeProprietario() {
        return nomeProprietario;
    }

    /**
     * @param nomeProprietario the nomeProprietario to set
     */
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    /**
     * @return the empresaPropriedade
     */
    public String getEmpresaPropriedade() {
        return empresaPropriedade;
    }

    /**
     * @param empresaPropriedade the empresaPropriedade to set
     */
    public void setEmpresaPropriedade(String empresaPropriedade) {
        this.empresaPropriedade = empresaPropriedade;
    }

    /**
     * @return the cargoPropriedade
     */
    public String getCargoPropriedade() {
        return cargoPropriedade;
    }

    /**
     * @param cargoPropriedade the cargoPropriedade to set
     */
    public void setCargoPropriedade(String cargoPropriedade) {
        this.cargoPropriedade = cargoPropriedade;
    }

    /**
     * @return the dependentes
     */
    public List<Dependente> getDependentes() {
        return dependentes;
    }

    /**
     * @param dependentes the dependentes to set
     */
    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    /**
     * @return the transferidoSTTR
     */
    public String getTransferidoSTTR() {
        return transferidoSTTR;
    }

    /**
     * @param transferidoSTTR the transferidoSTTR to set
     */
    public void setTransferidoSTTR(String transferidoSTTR) {
        this.transferidoSTTR = transferidoSTTR;
    }

    /**
     * @return the dataTransferenciaSTTR
     */
    public Date getDataTransferenciaSTTR() {
        return dataTransferenciaSTTR;
    }

    /**
     * @param dataTransferenciaSTTR the dataTransferenciaSTTR to set
     */
    public void setDataTransferenciaSTTR(Date dataTransferenciaSTTR) {
        this.dataTransferenciaSTTR = dataTransferenciaSTTR;
    }

    /**
     * @return the filiacaoMae
     */
    public String getFiliacaoMae() {
        return filiacaoMae;
    }

    /**
     * @param filiacaoMae the filiacaoMae to set
     */
    public void setFiliacaoMae(String filiacaoMae) {
        this.filiacaoMae = filiacaoMae;
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
     * @return the matriculaAnterior
     */
    public String getMatriculaAnterior() {
        return matriculaAnterior;
    }

    /**
     * @param matriculaAnterior the matriculaAnterior to set
     */
    public void setMatriculaAnterior(String matriculaAnterior) {
        this.matriculaAnterior = matriculaAnterior;
    }

    /**
     * @return the dataRecadastramento
     */
    public Date getDataRecadastramento() {
        return dataRecadastramento;
    }

    /**
     * @param dataRecadastramento the dataRecadastramento to set
     */
    public void setDataRecadastramento(Date dataRecadastramento) {
        this.dataRecadastramento = dataRecadastramento;
    }

    /**
     * @return the dataExpedicao
     */
    public Date getDataExpedicao() {
        return dataExpedicao;
    }

    /**
     * @param dataExpedicao the dataExpedicao to set
     */
    public void setDataExpedicao(Date dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    /**
     * @return the dataAdmissao
     */
    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    /**
     * @param dataAdmissao the dataAdmissao to set
     */
    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the naturalidade
     */
    public String getNaturalidade() {
        return naturalidade;
    }

    /**
     * @param naturalidade the naturalidade to set
     */
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    /**
     * @return the estadoCivil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * @return the conjuge
     */
    public String getConjuge() {
        return conjuge;
    }

    /**
     * @param conjuge the conjuge to set
     */
    public void setConjuge(String conjuge) {
        this.conjuge = conjuge;
    }

    /**
     * @return the grauInstrucao
     */
    public String getGrauInstrucao() {
        return grauInstrucao;
    }

    /**
     * @param grauInstrucao the grauInstrucao to set
     */
    public void setGrauInstrucao(String grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the uf
     */
    public UF getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(UF uf) {
        this.uf = uf;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the dataExpedicaoRG
     */
    public Date getDataExpedicaoRG() {
        return dataExpedicaoRG;
    }

    /**
     * @param dataExpedicaoRG the dataExpedicaoRG to set
     */
    public void setDataExpedicaoRG(Date dataExpedicaoRG) {
        this.dataExpedicaoRG = dataExpedicaoRG;
    }

    /**
     * @return the regimeAtividade
     */
    public RegimeAtividade getRegimeAtividade() {
        return regimeAtividade;
    }

    /**
     * @param regimeAtividade the regimeAtividade to set
     */
    public void setRegimeAtividade(RegimeAtividade regimeAtividade) {
        this.regimeAtividade = regimeAtividade;
    }

}
