/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.distribuidas.elecciones.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Pancho
 */
@Entity
@Table(name = "visita_detalle")
public class VisitaDetalle implements Serializable {
    
    @Id 
    @NotNull
    @Column(name = "SEC_VISITA_DETALLE", nullable = false)
    private Integer secVisitaDetalle;
    
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "SECCION", nullable = false, length = 16)
    private String seccion;
   
    @NotNull
    @Column(name = "TIEMPO", nullable = false)
    private Integer tiempo;
   
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "ACCION", nullable = false, length = 8)
    private String accion;
    //Es fk, no estoy seguro si van las propiedades
    @Column(name = "SEC_VISITA")
    private Integer secVisita;
    
    @JoinColumn(name = "SEC_VISITA", referencedColumnName = "SEC_VISITA", insertable = false, updatable = false)
    @ManyToOne
    private Visita visita;

    public VisitaDetalle() {
    }

    public VisitaDetalle(Integer secVisitaDetalle) {
        this.secVisitaDetalle = secVisitaDetalle;
    }    

    public Integer getSecVisitaDetalle() {
        return secVisitaDetalle;
    }

    public void setSecVisitaDetalle(Integer secVisitaDetalle) {
        this.secVisitaDetalle = secVisitaDetalle;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public Visita getVisita() {
        return visita;
    }

    public void setVisita(Visita visita) {
        this.visita = visita;
    }

    public Integer getSecVisita() {
        return secVisita;
    }

    public void setSecVisita(Integer secVisita) {
        this.secVisita = secVisita;
    }        

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secVisitaDetalle != null ? secVisitaDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VisitaDetalle)) {
            return false;
        }
        VisitaDetalle other = (VisitaDetalle) object;
        if ((this.secVisitaDetalle == null && other.secVisitaDetalle != null) || (this.secVisitaDetalle != null && !this.secVisitaDetalle.equals(other.secVisitaDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.elecciones.modelo.VisitaDetalle[ secVisitaDetalle=" + secVisitaDetalle + " ]";
    }

}
