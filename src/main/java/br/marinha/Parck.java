package br.marinha;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Desenvolvedor
 */
@Entity
public class Parck implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 200)
    private String marca;
    @Column(length = 200)
    private String hd;
    @Column(length = 200)
    private String processador;
    @Column(length = 200)
    private String memoria;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAquisicao;
    @Column(length = 100)
    private String ip;
    @Column(length = 100)
    private String macAddress;
    @Column(length = 100)
    private String setorResponsavel;
    @Column(length = 100)
    private String tipo;
    @Column(length = 100)
    private String  nome;
    @Column(length = 100)
    private String numeroEtiqueta;
    @Column(length = 100)
    private String numeroLacre;
    @Column(length = 100)
    private String sistemaOperacional;
    @Column(length = 100)
    private String  nomeDeGuerra;
    @Column(length = 100)
    private String nip;
    @Column(length = 100)
    private String cadastrante;
    @Column(length = 100)
    private String om;

    public Parck() {
    }

    public Parck(Integer id, String marca, String hd, String processador, String memoria, Date dataAquisicao, String ip, String macAddress, String setorResponsavel, String tipo, String nome, String numeroEtiqueta, String numeroLacre, String sistemaOperacional, String nomeDeGuerra, String nip, String cadastrante, String om) {
        this.id = id;
        this.marca = marca;
        this.hd = hd;
        this.processador = processador;
        this.memoria = memoria;
        this.dataAquisicao = dataAquisicao;
        this.ip = ip;
        this.macAddress = macAddress;
        this.setorResponsavel = setorResponsavel;
        this.tipo = tipo;
        this.nome = nome;
        this.numeroEtiqueta = numeroEtiqueta;
        this.numeroLacre = numeroLacre;
        this.sistemaOperacional = sistemaOperacional;
        this.nomeDeGuerra = nomeDeGuerra;
        this.nip = nip;
        this.cadastrante = cadastrante;
        this.om = om;
    }

    

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getSetorResponsavel() {
        return setorResponsavel;
    }

    public void setSetorResponsavel(String setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroEtiqueta() {
        return numeroEtiqueta;
    }

    public void setNumeroEtiqueta(String numeroEtiqueta) {
        this.numeroEtiqueta = numeroEtiqueta;
    }

    public String getNumeroLacre() {
        return numeroLacre;
    }

    public void setNumeroLacre(String numeroLacre) {
        this.numeroLacre = numeroLacre;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getNomeDeGuerra() {
        return nomeDeGuerra;
    }

    public void setNomeDeGuerra(String nomeDeGuerra) {
        this.nomeDeGuerra = nomeDeGuerra;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getCadastrante() {
        return cadastrante;
    }

    public void setCadastrante(String cadastrante) {
        this.cadastrante = cadastrante;
    }

    public String getOm() {
        return om;
    }

    public void setOm(String om) {
        this.om = om;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Parck other = (Parck) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Parck{" + "id=" + id + '}';
    }
    
    
    
    
    
    
    
    
}
