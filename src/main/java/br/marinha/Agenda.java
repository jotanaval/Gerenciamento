/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author junior
 */
@Entity
public class Agenda implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String executor;
    @Column(length = 2000)
    private String faxina;
    @Column(length = 2000)
    private String observacaoes;
    @Column(length = 2000)
    private String solucaoImpl;
    private String lancador;
        
     @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataSolicitacao;
      @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataExecFaxina;

    public Agenda() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getFaxina() {
        return faxina;
    }

    public void setFaxina(String faxina) {
        this.faxina = faxina;
    }

    public String getObservacaoes() {
        return observacaoes;
    }

    public void setObservacaoes(String observacaoes) {
        this.observacaoes = observacaoes;
    }

    public String getSolucaoImpl() {
        return solucaoImpl;
    }

    public void setSolucaoImpl(String solucaoImpl) {
        this.solucaoImpl = solucaoImpl;
    }

    public String getLancador() {
        return lancador;
    }

    public void setLancador(String lancador) {
        this.lancador = lancador;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public Date getDataExecFaxina() {
        return dataExecFaxina;
    }

    public void setDataExecFaxina(Date dataExecFaxina) {
        this.dataExecFaxina = dataExecFaxina;
    }

    @Override
    public String toString() {
        return "Agenda{" + "id=" + id + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Agenda other = (Agenda) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
}
