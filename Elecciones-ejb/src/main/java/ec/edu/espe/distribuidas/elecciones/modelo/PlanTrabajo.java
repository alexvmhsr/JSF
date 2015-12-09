/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.elecciones.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "plan_trabajo")
public class PlanTrabajo implements Serializable {

    @EmbeddedId
    private PlanTrabajoPK planTrabajoPK;

    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "TITULO", nullable = false, length = 500)
    private String titulo;

    @Size(max = 1000)
    @Column(name = "DESCRIPCION", length = 1000)
    private String descripcion;

    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ESTADO", nullable = false, length = 3)
    private String estado;

    @JoinColumn(name = "COD_CANDIDATO", referencedColumnName = "COD_CANDIDATO", insertable = false, updatable = false)
    @ManyToOne
    private CandidatoPropuesta candidatoPropuesta;

    public PlanTrabajo() {
    }

    public PlanTrabajo(PlanTrabajoPK planTrabajoPK) {
        this.planTrabajoPK = planTrabajoPK;
    }

    public PlanTrabajoPK getPlanTrabajoPK() {
        return planTrabajoPK;
    }

    public void setPlanTrabajoPK(PlanTrabajoPK planTrabajoPK) {
        this.planTrabajoPK = planTrabajoPK;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public CandidatoPropuesta getCandidatoPropuesta() {
        return candidatoPropuesta;
    }

    public void setCandidatoPropuesta(CandidatoPropuesta candidatoPropuesta) {
        this.candidatoPropuesta = candidatoPropuesta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (planTrabajoPK != null ? planTrabajoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanTrabajo)) {
            return false;
        }
        PlanTrabajo other = (PlanTrabajo) object;
        if ((this.planTrabajoPK == null && other.planTrabajoPK != null) || (this.planTrabajoPK != null && !this.planTrabajoPK.equals(other.planTrabajoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.elecciones.modelo.PlanTrabajo[ planTrabajoPK=" + planTrabajoPK + " ]";
    }

}
