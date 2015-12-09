/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.distribuidas.elecciones.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Pancho
 */
@Entity
@Table(name = "visita")

public class Visita implements Serializable {
    
    @Id
    @NotNull
    @Column(name = "SEC_VISITA", nullable = false)
    private Integer secVisita;
   
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "SESSION_BROWSER", nullable = false, length = 255)
    private String sessionBrowser;
    
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "IP", nullable = false, length = 15)
    private String ip;
    
    @NotNull
    @Column(name = "FECHA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    @NotNull
    @Column(name = "TIEMPO_TOTAL", nullable = false)
    private Integer tiempoTotal;
    //Es fk, no estoy seguro si van las propiedades
    @Column(name = "COD_CANDIDATO")
    private String codigoCandidato;
    
    @JoinColumn(name = "COD_CANDIDATO", referencedColumnName = "COD_CANDIDATO", insertable = false, updatable = false)
    @ManyToOne
    private Candidato candidato;    

    public Visita() {
    }

    public Visita(Integer secVisita) {
        this.secVisita = secVisita;
    }    

    public Integer getSecVisita() {
        return secVisita;
    }

    public void setSecVisita(Integer secVisita) {
        this.secVisita = secVisita;
    }

    public String getSessionBrowser() {
        return sessionBrowser;
    }

    public void setSessionBrowser(String sessionBrowser) {
        this.sessionBrowser = sessionBrowser;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(Integer tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public String getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCodigoCandidato(String codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }        

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secVisita != null ? secVisita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visita)) {
            return false;
        }
        Visita other = (Visita) object;
        if ((this.secVisita == null && other.secVisita != null) || (this.secVisita != null && !this.secVisita.equals(other.secVisita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.elecciones.modelo.Visita[ secVisita=" + secVisita + " ]";
    }

}
